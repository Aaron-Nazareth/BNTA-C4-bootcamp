package com.BntaAaronNazareth.Lessons.CH4_Object_Oriented_Programming_1.Week3_Monday.Car_oop_example;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car(    // Creates car using "Car" class
                "Honda",
                "1234",
                false
        );

        Car tesla = new Car(    // Creates car using "Car" class
                "Tesla",
                "5678",
                true
        );

        Car[] aaronCars = {honda, tesla};   // Creates an array of the cars

        Person aaron = new Person(  // Creates person using "Person" class
                "Aaron",
                23,
                "aaronnazareth@hotmail.co.uk",
                aaronCars
        );

        Garage aaronGarage = new Garage(    // Creates garage using "Garage" class
                aaron,
                1,
                3,
                true
        );

        GarageService garageService = new GarageService();  // Creates a garage service to apply business logic

        aaronGarage.setOpen(true);  // Sets garage to open

        for (Car aaronCar : aaron.getCars()) {  // Loops through cars and adds to garage if garage service criteria
            // is met
            garageService.addCar(
                    aaronGarage,
                    aaronCar
            );
        }

        System.out.println(aaronGarage);    // Print full garage contents info
        for (Car car : aaronGarage.getCars()) {
            System.out.println(car);    // Prints info for each car in the garage
        }

        System.out.println(garageService.getTotalNumberOfCarInGarage(aaronGarage)); // Uses a method we made to get
        // the total number of cars in the garage
    }
}
