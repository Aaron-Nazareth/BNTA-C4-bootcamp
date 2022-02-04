package com.BntaAaronNazareth.Exercises.E5_Writing_Methods;

public class Exercise6 {
    public static void main(String[] args) {
        // Write a method which takes an array of strings as an argument and returns the number of items in the array.

        String[] items = {"apple", "banana", "pear"};   // Create a string array to test
        numberOfItems(items);
    }

    public static void numberOfItems(String[] items) {
        int counter = 0;    // Create a counter variable with a placeholder value of 0

        for (String item : items) {
            counter++;  // Counter increments by 1 every time we loop through a new item
        }

        System.out.println(counter);    // Prints the final counter
    }
}
