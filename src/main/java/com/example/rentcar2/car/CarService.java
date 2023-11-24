package com.example.rentcar2.car;

import com.example.rentcar2.car.dto.CarCreateDto;
import com.example.rentcar2.car.entity.Car;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository  carRepository;
    private final ModelMapper mapper=new ModelMapper();
    public ModelAndView create(CarCreateDto carCreateDto, Model model) {
        Car car = mapper.map(carCreateDto, Car.class);
        car= carRepository.save(car);
         model.addAttribute("car",car);
        return new ModelAndView("index","car",model);
    }



    public ModelAndView get(UUID id, Model model){
        Car car = carRepository.findById(id).get();
        model.addAttribute("carInfo",car);
        model.addAttribute("message","<h3> "+ car+"</h3>");
        return new ModelAndView("car/carInfo",model.asMap());
    }

    public List<Car> findByDate(LocalDate dateReceiving, LocalDate returnDate) {
        return carRepository.findByDate(dateReceiving,returnDate);
    }

    public Car findById(UUID id) {
        return carRepository.findById(id).get();
    }
}
