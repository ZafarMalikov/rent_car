package com.example.rentcar2.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequestDto {
    private String username;
    private String lastName;
    private String email;

    private String password;

    private String picture;

}
