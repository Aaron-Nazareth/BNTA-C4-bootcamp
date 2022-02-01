package com.bnta.c4.AaronNazareth.Exercises.E6_Arrays_and_Conditionals_and_Methods;

public class Exercise1 {
    /*
     Write a method that reverses any String and print to console
     Input should be a string
     Output should be reversed input
   */
    public static void main(String[] args) {
        // invoke your function here
        System.out.println(reverse("LOOP"));
        System.out.println(reverse("DOOM"));

    }

    static String reverse(String input) {   // Creates a method called "reverse", specified to have a string input
        String output = "";     // Creates a placeholder empty string that we can add to
        for (int i = input.length() - 1; i >= 0; i--) {     // For loop starting at final index, stopping at the
            // first index (index 0) and decrementing by 1 each time in between
            output += input.charAt(i);      // Concatenates (adds to) the previous output with each new character at the
            // current index being looped through
        }
        return output;      // Returns the final output after the loop has finished - stores it to be used later
    }
}
