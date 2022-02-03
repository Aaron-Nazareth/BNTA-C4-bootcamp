package com.BntaAaronNazareth.Exercises.E3_Working_With_Arrays;

import java.util.Arrays;

public class Question5_6_7 {
    public static void main(String[] args) {
        // 5. declare and initialise a String array which holds the values "a", "b", "c" and "d"
        // print the array to the console
        String[] array = new String[] {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(array));
        System.out.println("---------------");

        // 6a. using your answer to Q5, create a second array which is initialised using your original array
        // hint: instead of using the `new` keyword, try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        // print both of your arrays and compare
//        String[] array2 = array;
//        array2[0] = "z";
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//        System.out.println("---------------");

        // 6b. using your answer to Q5, create another array which is A COPY off of your original array (using the
        //  `Arrays.copyOf()` method)
        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and
        // second being the length of the new array
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare
        String[] array3 = Arrays.copyOf(array, array.length);
        array3[0] = "z";
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array3));
        System.out.println("---------------");

        // 7. using your array from Q5, create a `for` loop which prints each item in the array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);   // Using a for i loop
        }
        // Alternatively, we could use an enhanced for loop:
        for (String letter : array) {
            System.out.println(letter);
        }
        System.out.println("---------------");
    }
}
