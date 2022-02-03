package com.BntaAaronNazareth.Exercises.E4_Working_With_Loops;

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        // using your answer from Question 4, create a for loop that goes through the values
        // print each value individually

        int[] array = new int[11];  // Creates array with 11 indexes
        for (int i = 0; i <= 10; i++) {     // Loops through indexes 0 to 10, incrementing by 1
            array[i] = i;   // At each index, fill the array with corresponding value
        }

        for (int i : array) {   // Loop through each index in the array
            System.out.println(i);  // Print current array index
        }
    }
}
