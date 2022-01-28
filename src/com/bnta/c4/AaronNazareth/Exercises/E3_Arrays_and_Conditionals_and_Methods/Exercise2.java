package com.bnta.c4.AaronNazareth.Exercises.E3_Arrays_and_Conditionals_and_Methods;

import java.util.Arrays;

public class Exercise2 {
    /*
      Given the following String input:
      String input = "   b ri   ght net   work  "
      Write a program that transforms input into: Bright Network
    */
    public static void main(String[] args) {
        String input = "   b ri   ght net   work  ";
        // Convert string input to an array
        String inputNoSpaces = input.replaceAll("\\s","");
        String[] inputArray = inputNoSpaces.split("t", 2);
        System.out.println(Arrays.toString(inputArray));
    }

    // Create a loop to move through array and store values inside an empty placeholder, but have an if statement to
    // ensure that it will skip the empty spaces
}
