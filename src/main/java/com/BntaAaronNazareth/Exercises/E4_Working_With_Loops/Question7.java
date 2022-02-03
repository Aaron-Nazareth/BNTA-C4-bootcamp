package com.BntaAaronNazareth.Exercises.E4_Working_With_Loops;

import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        // create a for loop which goes through each string in our array
        // make each word uppercase
        // assign the value in the array to the uppercase string
        // print our resulting array

        String[] initial = new String[]{"i", "sure", "do", "love", "bees"};     // Create initial array

        for (int i = 0; i < initial.length; i++) {
         initial[i] = initial[i].toUpperCase(); // Each index is a string, so we can use uppercase command to make
            // full word uppercase
        }

        System.out.println(Arrays.toString(initial));   // Prints re-written initial array
    }
}
