package com.example.rentcar2.rent;

import jakarta.persistence.Column;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rent")
@RequiredArgsConstructor
public class RentController {

    private final RentService rentService;



}
