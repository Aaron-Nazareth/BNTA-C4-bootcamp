package com.BntaAaronNazareth.Exercises.E10_Intro_to_Classes;

public class Car {
    private String manufacturer;
    private int price;
    private EngineType engineType;

    // Setters
    public void setManufacturer (String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setPrice (int price) {
        this.price = price;
    }
    public void setEngineType (EngineType engineType) {
        this.engineType = engineType;
    }

    // Getters
    public String getManufacturer() {
        return manufacturer;
    }
    public int getPrice() {
        return price;
    }
    public EngineType getEngineType() {
        return engineType;
    }
}
