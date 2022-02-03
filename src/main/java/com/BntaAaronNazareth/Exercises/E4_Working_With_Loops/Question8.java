package com.BntaAaronNazareth.Exercises.E4_Working_With_Loops;

import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        String[] initial = new String[]{"i", "sure", "do", "love", "bees"};     // Create initial array

        for (int i = 0; i < initial.length; i++) {  // create a for loop which goes through each string in our array
            char firstLetterOfWord = initial[i].charAt(0);  // grab the first letter of our word
            char capitalisedLetter = Character.toUpperCase(firstLetterOfWord);  // capitalise the first letter
            String capitalisedWord = capitalisedLetter + initial[i].substring(1);   // add the capitalised letter to
            // the rest of the provided word
            initial[i] = capitalisedWord;   // assign the value to an array
        }

        System.out.println(Arrays.toString(initial));   // print our resulting array
    }
}
