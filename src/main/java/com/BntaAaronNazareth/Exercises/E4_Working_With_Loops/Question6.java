package com.BntaAaronNazareth.Exercises.E4_Working_With_Loops;

public class Question6 {
    public static void main(String[] args) {
        // create a sum variable
        // using your answer from Question 4, create a for loop that goes through the values
        // add each item to the sum value
        // print the total sum

        int[] array = new int[11];  // Creates array with 11 indexes
        int sum = 0;    // Creates integer variable as placeholder for sum

        for (int i = 0; i <= 10; i++) {     // Loops through indexes 0 to 10, incrementing by 1
            array[i] = i;   // At each index, fill the array with corresponding value
        }

        for(int i : array) {
            sum += i;   // Loop through each index value and add it to the new sum
        }

        System.out.println(sum);    // Print final sum
    }
}
