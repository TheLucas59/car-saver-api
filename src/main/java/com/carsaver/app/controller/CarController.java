package com.carsaver.app.controller;

import com.carsaver.app.entity.Car;
import com.carsaver.app.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    public CarRepository carRepo;

    @PostMapping("add")
    public Car addCar(@RequestBody Car car) {
        return carRepo.save(car);
    }

    @GetMapping("getAll")
    public List<Car> getAll() {
        return carRepo.findAll();
    }
}
