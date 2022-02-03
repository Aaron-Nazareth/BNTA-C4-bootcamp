package com.BntaAaronNazareth.Exercises.E10_Intro_to_Classes;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setManufacturer("BMW");
        car1.setPrice(35_000);
        car1.setEngineType(EngineType.ELECTRIC);
        System.out.println(car1.getManufacturer());
        System.out.println(car1.getPrice());
        System.out.println(car1.getEngineType());

        CarDealership newDealer = new CarDealership(
                "Naz Cars",
                5
        );
        System.out.println(newDealer);
    }
}
