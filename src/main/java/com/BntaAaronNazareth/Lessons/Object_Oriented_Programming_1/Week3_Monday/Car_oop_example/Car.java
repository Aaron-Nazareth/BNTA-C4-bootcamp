package com.BntaAaronNazareth.Lessons.Object_Oriented_Programming_1.Week3_Monday.Car_oop_example;

public class Car {
    private String make;
    private String regNumber;
    private boolean isElectric;

    public Car(String make, String regNumber, boolean isElectric) {
        this.make = make;
        this.regNumber = regNumber;
        this.isElectric = isElectric;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }
}
