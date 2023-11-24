package com.example.rentcar2.car;

import com.example.rentcar2.car.dto.CarCreateDto;
import com.example.rentcar2.car.entity.Car;
import com.example.rentcar2.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;
    private final CarRepository  carRepository;

    @PostMapping
    public ModelAndView createCar(@RequestBody CarCreateDto carCreateDto, Model model){
        System.out.println("car create");
        return carService.create(carCreateDto,model);
    }

    @GetMapping("/car-create")
    public String carCreate(){
        return "car/car-create";
    }

    @GetMapping()
    public ModelAndView getCarByDate(Model model
            ,@Param(value = "start")LocalDate start
            ,@Param(value = "end")LocalDate  end){
        List<Car> repositoryByDate = carService.findByDate(start, end);
        model.addAttribute("dateCars",repositoryByDate);
        return new ModelAndView("index",model.asMap()) ;
    }





    @GetMapping("/{carId}")
    public ModelAndView getCarById(Model model, @PathVariable ("carId")UUID id) {
        Car car = carRepository.findById(id).get();
        model.addAttribute("carInfo",car);
        return new ModelAndView("index",model.asMap());
    }

//    @GetMapping("/car-create")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
//    public String carCreate(){
//        System.out.println("car create");
//        return "car/car-create";
//    }

    @GetMapping("/rent/{id}")
    public String rentNow(@PathVariable UUID id, Authentication authentication){
        User user = (User) authentication.getPrincipal();
        Car car = carService.findById(id);
        car.setUser(user);
        carRepository.save(car);
        return "redirect:/";
    }





}
