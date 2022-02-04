package com.BntaAaronNazareth.Exercises.E5_Writing_Methods;

public class Exercise1 {
    public static void main(String[] args) {
        // Write a method which takes two numbers as arguments and prints their sum to the terminal.

        sumOfTwoNumbers(2, 8);  // Calls our sum method to main and gives it specific inputs, so we can run it
    }

    public static void sumOfTwoNumbers(int num1, int num2) {    // Creates static method belonging to "Exercise 1"
        // class, which can be called on in the main. Sets 2 integer arguments.
        int sum = num1 + num2;  // Creates sum variable using our arguments
        System.out.println(sum);    // Prints the sum
    }
}
