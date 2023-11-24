package com.example.rentcar2.user;

import com.example.rentcar2.user.dto.UserRequestDto;
import com.example.rentcar2.user.dto.UserResponseDto;
import com.example.rentcar2.user.entity.User;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper = new ModelMapper();

    @Transactional
    public UserResponseDto create(UserRequestDto userRequestDto) {
        User user = modelMapper.map(userRequestDto, User.class);
        userRepository.save(user);
        return modelMapper.map(user, UserResponseDto.class);
    }


    @Transactional
    public User get(UUID id) {
        return userRepository.findById(id).get();
    }


    @Transactional
    public List<UserResponseDto> getAll() {
        List<User> all = userRepository.findAll();
        return all.stream().map(user -> modelMapper.map(user, UserResponseDto.class)).toList();
    }

    @Transactional
    public UserResponseDto update(UUID id, UserRequestDto requestDto) {
        User user = userRepository.findById(id).get();
        modelMapper.map(requestDto, user);
        User save = userRepository.save(user);

        return modelMapper.map(save, UserResponseDto.class);

    }

    @Transactional
    public void delete(UUID userId) {
        userRepository.deleteById(userId);
    }


    @Transactional
    public void register(String username, String password, String email, String lastname) throws IOException {

//        Path path = Path.of("src/main/resources/static/imageP/"+picture.getOriginalFilename());
//        Files.write(path,picture.getBytes());
        password=passwordEncoder.encode(password);
        User user = User.builder().id(UUID.randomUUID())
//                .picture(picture.getOriginalFilename())
                .username(username)
                .email(email)
                .password(password)
                .lastName(lastname)
                .build();
        userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findUserByUsername(username);
    }
}
