package com.BntaAaronNazareth.Exercises.E2_Java_Fundamentals_2;

public class Exercise4 {
    public static void main(String[] args) {
        /*
           Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

           Tip:
            - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
            - create variable to store result. double result = 0;
            - convert string to array.
            - then loop.
            - convert each string to decimal and add to current result
        */

        String input = "0.90, 1.00, 9.00, 8.78, 0.01";  // Set string input
        String [] array = input.split(", ");    // Convert string to an array, instructing it to split indexes after
        // each comma

        double result = 0;  // Creates a variable to store the result

        for (String number : array) {    // Creates for loop which assigns each array element to a string variable
            // "number"
            double decimalNumber = Double.parseDouble(number);  // Converts string version of number to a double
            result += decimalNumber;    // New result variable created by adding number to current result
        }
        System.out.println(result);     // Prints final result after loop has been completed
    }
}
