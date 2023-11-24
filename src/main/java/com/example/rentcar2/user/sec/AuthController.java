package com.example.rentcar2.user.sec;


import com.example.rentcar2.car.entity.Car;
import com.example.rentcar2.user.UserService;
import com.example.rentcar2.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    private AuthenticationManager authenticationManager;

    @GetMapping("/sign-in")
    public String signIn(){
        return "reg/sign-in";
    }



    @GetMapping("/sign-up")
    public String signUp(){
        return "reg/sign-up";
    }

    @PostMapping("/sign-up")
    public String register(@RequestParam String username,
                           @RequestParam String password,
                           @RequestParam String email,
                           @RequestParam String lastname
                           ) throws IOException {
         userService.register(username,password,email,lastname);
        return "redirect:/";

    }



    @GetMapping("/user-profile")
    public String userProfile(Authentication authentication, Model model){
        User principal = (User) authentication.getPrincipal();
        UUID id = principal.getId();
        User user = userService.get(id);
        List<Car> car = user.getCar();
        model.addAttribute("userCars",car);
        model.addAttribute("userInfo",user);
        return "reg/profile";
    }

    @GetMapping
    public String  userProfilePicture(Authentication authentication,Model model){
        if (authentication==null){
            return "index";
        }else {
        User principal = (User) authentication.getPrincipal();
        model.addAttribute("user", principal.getPicture());
        return "index";
        }
    }






}

