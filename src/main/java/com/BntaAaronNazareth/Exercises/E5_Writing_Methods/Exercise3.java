package com.BntaAaronNazareth.Exercises.E5_Writing_Methods;

public class Exercise3 {
    public static void main(String[] args) {
        /*
         Write a method which takes two numbers as arguments, checks if they are the same and returns the
         appropriate boolean value.
         You should check both possible outcomes here, i.e. that it returns true when it is supposed to and false
         when it is supposed to.
        */
        checksIfTwoNumbersAreTheSame(4, 4);
        checksIfTwoNumbersAreTheSame(4, 5);
        checksIfTwoNumbersAreTheSame(5, 5);
    }

    public static void checksIfTwoNumbersAreTheSame(int num1, int num2) {
        boolean result = num1 == num2;  // Creates boolean result variable as the comparison of our inputs
        System.out.println(result);

//        // Alternative, longer code where I had used an if statement
//        boolean result = false; // Default result is set to false
//        if (num1 == num2) { // Checks if the inputs are equivalent
//            result = true;  // Makes result true
//        }
//        System.out.println(result);
    }
}
