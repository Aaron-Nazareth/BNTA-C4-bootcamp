package com.bnta.c4.AaronNazareth.Exercises.E3_Working_With_Arrays;

import java.util.Arrays;

public class Question1_2_3_4 {
    public static void main(String[] args) {
        // 1. declare an empty integer array of length = 3
        int[] empty = new int[3];

        // 2. using your array from Q1, print the contents to the console
        System.out.println(Arrays.toString(empty));

        // 3. using your array from Q1, fill it with the number `4`
        // print the array to the console
        Arrays.fill(empty, 4);
        System.out.println(Arrays.toString(empty));

        // 4. adding onto your code from questions 1-3, reassign the second value in the array to the number `17`
        // print the array to the console
        empty[1] = 17;
        System.out.println(Arrays.toString(empty));
    }
}
