package com.carsaver.app.entity;

import lombok.Data;

@Data
public class Engine {

    private String engineCode;
    private int cylinderCapacity;
    private int numberOfCylinders;
    private String cylinderArchitecture;
    private int horsepower;
    private String timingBeltType;
    private String injectionType;
    private int camshaftNumber;
    private String fuel;
    private int fuelCapacity;
    private int topSpeed;
    private double consumptionByHundredKilometers;
}
