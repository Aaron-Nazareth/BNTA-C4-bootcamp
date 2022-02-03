package com.BntaAaronNazareth.Exercises.E2_Java_Fundamentals_2;

public class Exercise5 {
    /*
       Write a program that takes arguments from the program args and loops through args and prints each item in args
       Compile using: javac and run using: java
       i.e. javac Exercise5.java | java Exercise5 foo bar baz
     */
    public static void main(String[] args) {
        // Loop through args here
        for (String arg : args) {   // For each element in the input string array "args", assign it to variable "arg"
            System.out.println(arg);    // Print each element "arg" on a new line
        }
    }
}
// Now method is set up, we can compile and run using the terminal:
// Step 1 - making sure that working directory is src, we need to use "javac [type or copy file path]/Exercise5.java"
// to compile.
// Step 2 - use "java [type or copy file path]/Exercise5 foo bar baz"
// NOTE: MUST use "/" to separate files along file path when in terminal despite "." being used in Java class files!
