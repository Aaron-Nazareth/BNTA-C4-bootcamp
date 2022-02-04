package com.BntaAaronNazareth.Exercises.E5_Writing_Methods;

import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        /*
         Write a method which takes a sentence as an argument, counts the number of words in the array and prints
         "The sentence contains X words".
        */
        numberOfWordsInASentence("Hello");
        System.out.println("--------");
        numberOfWordsInASentence("Shall we see if this works?");
        System.out.println("--------");
        numberOfWordsInASentence("Hello from the other side");  // Big up Adele
    }

    public static void numberOfWordsInASentence(String sentence) {
        String[] sentenceArray = sentence.split(" ");   // Creates a string array from the string sentence, using the
        // split command to split after every space (hence using " " as regex)
        int counter = 0;    // As with ex6, we create a counter placeholder variable with a default value of 0

        for (String word : sentenceArray) {
            counter++;  // Counter increments by 1 every time we loop through a new word in the array
        }

        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("This sentence contains " + counter + " words"); // Note spaces included with quotes to
        // ensure our print reads nicely when switching between strings and an int
    }
}
