package com.example.blombiler.service;

import com.example.blombiler.model.Car;
import com.example.blombiler.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepo carRepo;

    public List<Car> getCars() {
        return carRepo.getCars();
    }

    public Car getCar(int car_id) {
        return carRepo.getCar(car_id);
    }
}
