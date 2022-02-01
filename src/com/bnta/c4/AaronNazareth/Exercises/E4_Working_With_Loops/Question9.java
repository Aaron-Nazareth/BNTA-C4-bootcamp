package com.bnta.c4.AaronNazareth.Exercises.E4_Working_With_Loops;

public class Question9 {
    public static void main(String[] args) {
        // create a for loop which goes through number in our array
        // check whether the value is greater than the current greatest value
        // reassign the current greatest value if true
        // print the greatest value

        int[] numbers = new int[]{1, 6, 17, 9, 20, 5};
        int maxNum = 0; // Placeholder for our max number

        for (int number : numbers) {    // Loop through each number in the array
            if (number > maxNum) {  // Check if the number is greater than current max number
                maxNum = number;    // If greater, then replace max number with current number and continue loop
            }
        }
        System.out.println(maxNum); // Print final max number, therefore greatest value in array
    }
}
