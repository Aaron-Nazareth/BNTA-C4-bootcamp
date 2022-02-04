package com.BntaAaronNazareth.Exercises.E5_Writing_Methods;

import java.util.Arrays;
import java.util.Locale;

public class Exercise5 {
    public static void main(String[] args) {
        /*
         Write a method which takes a string as an argument, capitalises the first letter and returns the
         capitalised string.
        */
        capitaliseFirstLetter("sample");
    }

    public static void capitaliseFirstLetter(String word) {
        String capitalised = word.substring(0, 1).toUpperCase() + word.substring(1);    // Substring allows us to
        // break string into parts we want to manipulate. Here we extract the first letter and uppercase it, then add
        // on the rest of the string. These two substrings form a new string we have created to store this result.
        System.out.println(capitalised);
    }
}
