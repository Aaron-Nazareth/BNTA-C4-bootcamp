package com.BntaAaronNazareth.Exercises.E4_Working_With_Loops;

import java.sql.Array;
import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array

        int[] array = new int[11];  // Creates array with 11 indexes
        for (int i = 0; i <= 10; i++) {     // Loops through indexes 0 to 10, incrementing by 1
            array[i] = i;   // At each index, fill the array with corresponding value
        }
        System.out.println(Arrays.toString(array)); // Prints final array after loop finishes
    }
}
