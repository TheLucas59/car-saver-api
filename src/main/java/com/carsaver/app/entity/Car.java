package com.carsaver.app.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "cars")
@Data
public class Car {

    @Id
    public String carId;
    private String brand;
    private String model;
    private String carCategory;
    private LocalDate deliveryDate;
    private String doorsAvailable;
    private int mileage;

    private List<Wheel> wheelsAvailable;
    private List<Engine> enginesAvailable;
    private List<Gearbox> gearboxesAvailable;
}
