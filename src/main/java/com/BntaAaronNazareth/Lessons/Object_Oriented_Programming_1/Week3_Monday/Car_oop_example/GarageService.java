package com.BntaAaronNazareth.Lessons.Object_Oriented_Programming_1.Week3_Monday.Car_oop_example;

import java.util.Arrays;

public class GarageService {
    // This class performs all business logic for the following
    // 1. add cars
    // 2. how many cars in the garage
    // 3. number of free spots in garage
    // 4. remove car
    // 5. Open and close garage
    // 6. isGarageFull
    // 7. filter electric cars
    // 8. filter non-electric cars
    // 9. Clean garage. Remove all cars and put them back and in between print garage cleaned
    // 10. Create GarageDAO class and store current cars in garage to a file
    // 11. Create a second method to read cars from a file

    // 1. Add cars
    public void addCar(Garage garage, Car car) {
        // Check if open
            // If open, check that it is not full
                // Add car to garage
                // If full, throw exception
            // If not open, throw exception

        if (garage.isOpen()) {  // Checks if garage is open
            int currentCarsInGarageCount = getTotalNumberOfCarInGarage(garage); // Sets current number of cars in garage
            if (currentCarsInGarageCount < garage.getCapacity()) {
                for (int i = 0; i < garage.getCars().length; i++) {     // Loops through each space in the garage
                    if (garage.getCars()[i] == null) {  // Checks for empty space
                        garage.getCars()[i] = car;  // Replaces empty space with car
                        break;  // Breaks out of for loop once all empty spaces are filled
                    }
                }
            }
            else {
                throw new IllegalStateException(garage.getGarageNumber() + " is full, sorry!");
            }
        }
        else {
            throw new IllegalStateException(garage.getGarageNumber() + " is closed, sorry!");
        }
    }

    // 2. How many cars are in the garage
    public int getTotalNumberOfCarInGarage(Garage garage) {    // Keeps count of total number of cars in garage
        int currentCarsInGarageCount = 0;   // Set initial count
        for (Car c : garage.getCars()) {    // Loops through each space in the garage
            if (c != null) {    // If a space isn't empty, then add to the count to represent an occupied space
                currentCarsInGarageCount++;
            }
        }
        return currentCarsInGarageCount;    // returns count value to be used elsewhere
    }

    // 3. Number of free spots in garage
    public int getFreeSpacesInGarageCount(Garage garage) {
        int freeSpaces = 0;
        for (Car c : garage.getCars()) {
            if (c == null) {
                freeSpaces++;
            }
        }
        return freeSpaces;
    }

    // 4. Remove car
    public boolean removeCar(Garage garage, Car car) {
        // find current car position in array and set it to null.
        // then return true meaning car was removed
        // otherwise false
        for (int i = 0; i < garage.getCars().length; i++) {
            if (car.equals(garage.getCars()[i])) {
                garage.getCars()[i] = null;
                return true;
            }
        }
        return false;
    }

    // 5. Open garage
    public void openGarage(Garage garage) {
        garage.setOpen(!garage.isOpen());   // If true, make it false. If false, make it true.
    }

    // 6. Is the garage full?
    public boolean isGarageFull(Garage garage) {
        // if free spaces is 0, then garage must be full
        return getFreeSpacesInGarageCount(garage) == 0;
    }

    // 7 & 8. Filter electric and non-electric cars
    public Car[] filterByElectric(Garage garage, boolean isElectric) {
        // Calculate new array size for filtered cars
        int arraySize = 0;
        for (Car car : garage.getCars()) {
            if (car == null) {
                continue;
            }
            if (car.isElectric() == isElectric) {
                arraySize++;
            }
        }
        Car[] electricCars = new Car[arraySize];
        // add filtered cars to new electricCars array
        int index = 0;
        for (Car car : garage.getCars()) {
            if (car == null) {
                continue;
        }
            if (car.isElectric() == isElectric) {
                electricCars[index++] = car;
            }
        }
        return electricCars;
    }

    // 9. Clean garage. Remove all cars and put them back and in between print garage cleaned
        public void cleanGarage(Garage garage) {
            // store cars into temp array
            Car[] cars = garage.getCars();
            // remove cars
            Arrays.fill(garage.getCars(), null);
            int freeSpacesInGarageCount = getFreeSpacesInGarageCount(garage);
            System.out.println("free spaces in garage " + freeSpacesInGarageCount);
            System.out.println("cleaning garage");
            System.out.println("cleaning done");
            System.out.println("put cars back to garage");
            // put them back into garage taking each car from cars
            for (int i = 0; i < garage.getCars().length; i++) {
                garage.getCars()[i] = cars[i];
            }
            System.out.println("free spaces in garage " + freeSpacesInGarageCount);
            System.out.println("all cars in garage");
        }
}
