package com.example.blombiler.controller;

import com.example.blombiler.model.Car;
import com.example.blombiler.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("/showcars")
    public String showCars(Model model) {
        List<Car> getCars = carService.getCars();
        model.addAttribute("getCars", getCars);
        return "car-copy";
    }

    @PostMapping("/car-page")
    public String carPage(Model model, @RequestParam int car_id) {
        Car car = carService.getCar(car_id);
        model.addAttribute("car", car);
        List<String> features = Arrays.asList(carService.getCar(car.getCar_id()).getCar_feature().split("_"));

        model.addAttribute("features", features);
        return "carpage";
    }

}
