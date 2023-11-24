package com.example.rentcar2.car.entity;

import com.example.rentcar2.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "car_id")
    private UUID id;


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

    @Column(name = "data_receiving")
    private LocalDate dateReceiving;


    @Column(name = "return_date")
    private LocalDate returnDate;

    private String picture;

    @ManyToOne
    @JoinTable(name = "user_car",
            joinColumns = @JoinColumn(name = "car_id"))
    private User user;
}
