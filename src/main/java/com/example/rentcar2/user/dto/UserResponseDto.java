package com.example.rentcar2.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserResponseDto {
    private String name;
    private String email;
    private UUID id;

}
