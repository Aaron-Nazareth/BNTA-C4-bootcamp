package com.BntaAaronNazareth.Exercises.E3_Working_With_Arrays;

import java.util.Arrays;

public class Question8_9 {
    public static void main(String[] args) {
        // 8. declare a new array which can hold the numbers from 1-10 (inclusive)
        // create a `for` loop which initialises this array with the numbers 1-10
        // print the array to the console
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // At each index we want the value to be one greater, i.e. at index[0], we want a
            // value of 1, etc.
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("---------------");

        // 9. adding onto your example from Q8, now create a second `for` loop which reassigns each value in the array
        // to be double the initial value
        // again print the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;    // Multiply the value at each index by 2 and reassign.
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("---------------");
    }
}
