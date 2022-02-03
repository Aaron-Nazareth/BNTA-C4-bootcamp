package com.BntaAaronNazareth.Exercises.E6_Arrays_and_Conditionals_and_Methods;

public class Exercise7 {
    /*
        Write a method that finds the longest string in any given array.
        i.e. [] -> ""
        i.e. ["hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
    */
    public static void main(String[] args) {
        String[] listOfStrings = {"Aaron", "Robert", "Chris"};  // Creates a string array of the words we want to
        // test
        System.out.println(longestWords(listOfStrings));    // Invokes the longestWords method with the input string
        // array of words
    }

    static String longestWords(String[] input) {
        String longest = "";    // Placeholder string
        int longestWord = 0;    // Placeholder int to store length of the longest word(s)

        for (String i : input) {    // Word is input as string
            if(i.length() > longestWord) {  // Check if word length is longer than currently stored value
                longestWord = i.length();   // Make stored longest word value equal to the new, larger value
                longest = i + ". ";     // Make the corresponding input the longest word
            }
            else if(i.length() == longestWord) {    // Check if word length is equal to the currently stored value
                longest += i + ". ";    // Concatenate stored longest word with the equivalent length word so both
                // can be displayed
            }
        }
        return longest;     // Returns the longest word value, so it can be called on
    }
}
