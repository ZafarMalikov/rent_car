package com.example.rentcar2.user;

import com.example.rentcar2.user.dto.UserRequestDto;
import com.example.rentcar2.user.dto.UserResponseDto;
import com.example.rentcar2.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Parameter;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;


    @PostMapping
    public UserResponseDto create(@RequestBody UserRequestDto userRequestDto){

        return userService.create(userRequestDto);
    }

    @GetMapping("/{userId}")
    public User get(@PathVariable ("userId")UUID id){
        return userService.get(id);
    }

    @GetMapping
    public List<UserResponseDto> getAll(){
        return userService.getAll();
    }

    @PutMapping("/{userId}")
    public UserResponseDto update( @RequestBody User user,@PathVariable("userId")UUID id, @Param(value= "username") String username,
                                 @Param(value = "lastname")String lastname,
                                 @Param(value = "email")String email){
        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setEmail(email);
        userRequestDto.setUsername(username);
        userRequestDto.setLastName(lastname);
        return  userService.update(id,userRequestDto);
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable("userId")UUID userId){
        userService.delete(userId);
    }




}
