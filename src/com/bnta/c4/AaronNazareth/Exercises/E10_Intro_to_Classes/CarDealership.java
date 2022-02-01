package com.bnta.c4.AaronNazareth.Exercises.E10_Intro_to_Classes;

import java.util.Arrays;

public class CarDealership {
    private String name;
    private int MaxCarsOnDisplay;
    private Car[] CarsInStock;

    public CarDealership(String name, int maxCarsOnDisplay) {
        this.name = name;
        MaxCarsOnDisplay = maxCarsOnDisplay;
        CarsInStock = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCarsOnDisplay() {
        return MaxCarsOnDisplay;
    }

    public void setMaxCarsOnDisplay(int maxCarsOnDisplay) {
        MaxCarsOnDisplay = maxCarsOnDisplay;
    }

    public Car[] getCarsInStock() {
        return CarsInStock;
    }

    public void setCarsInStock(Car[] carsInStock) {
        CarsInStock = carsInStock;
    }

    @Override
    public String toString() {
        return "CarDealership{" +
                "name='" + name + '\'' +
                ", MaxCarsOnDisplay=" + MaxCarsOnDisplay +
                ", CarsInStock=" + Arrays.toString(CarsInStock) +
                '}';
    }
}
