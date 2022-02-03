package com.BntaAaronNazareth.Exercises.E2_Java_Fundamentals_2;

public class Exercise3 {
    public static void main(String[] args) {
        /*
            Write a program that reverses an array of Strings
            String[] content = {"you", "are", "how", "hello"}
            Tip. Use for loop and you to start at highest index.
            Output should be: hello how are you?. Note question mark at the end
        */
        String[] content = {"you", "are", "how", "hello"};

        String result = ""; // Set up an empty result string
        for (int i = content.length - 1; i >= 0; i--) {
            // initial expression defined using "int i" - this is set to be the final index (length of array -1)
            // "i >= 0" used to stop loop at first array index
            // "i--" used to decrement through the array indexes
            result += content[i] + " ";
            // "+=" used to concatenate the empty result string with the string of each index we loop through
        }
        System.out.println(result.substring(0, result.length() - 1) + "?");
        // Prints the result with a substring attached, starting a defined index (in this case, right on the end of
        // the string)
    }
}
