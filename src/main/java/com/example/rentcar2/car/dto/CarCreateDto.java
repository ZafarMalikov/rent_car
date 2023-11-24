package com.example.rentcar2.car.dto;

import com.example.rentcar2.user.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarCreateDto {

    private Integer year;
    private String type;
    private Double rasxod;

    @Column(name="name")
    private String name;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;


    @Column(name = "prise")
    private Double price;

    @Column(name = "number_of_seats")
    private Integer numberOfSeats;

    private LocalDate manufacturedDate;

    private String picture;

    @ManyToOne
    @JoinTable(name = "user_id")
    private User user;
}
