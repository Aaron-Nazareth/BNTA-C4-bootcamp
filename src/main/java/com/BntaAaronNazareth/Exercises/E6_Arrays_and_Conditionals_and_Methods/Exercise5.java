package com.BntaAaronNazareth.Exercises.E6_Arrays_and_Conditionals_and_Methods;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    /*
        Write a method that displays random joke to the user.
        Your program should stop displaying jokes when use inputs no.
        For e.g
        Want to hear a joke? Yes/No
            if yes then display joke and repeat same question
            if no then program should exit
    */
    public static void main(String[] args) {
        boolean keepAsking = true;  // Sets default scenario that assumes user wants to be asked about hearing
        // another joke

        while (keepAsking) {    // While "keepAsking" is the default, we will keep looping
            Scanner scanner = new Scanner(System.in);   // Create a new scanner to take user inputs
            System.out.println("Do you want to hear a joke? Please enter yes or no: ");
            String input = scanner.nextLine();  // Reads the user input
            if (input.toLowerCase().equals("yes")) {    // .lowercase used to account for any user case-preference on
                // the word yes
                generateJoke(); // Invokes our joke generator if user has said yes
            }
            else if (input.toLowerCase().equals("no")) {    // .lowercase used to account for any user
                // case-preference on the word no
                keepAsking = false; // Sets "keepAsking" to false in order to break out of while loop and end program,
                // as per user demand
            }
            else {
                System.out.println("Input not recognised, please try again");   // Rejects other user inputs and then
                // continues while loop - asks question again
            }
        }
    }

    public static void generateJoke() {
        String[] jokes = {"I don’t trust stairs. They are always up to something.",
                "Why didn’t Han Solo enjoy his steak dinner? It was Chewie.",
                "I sold our vacuum cleaner; it was just gathering dust."};    // Create an array of our jokes
        Random random = new Random();   // Create a new random number generator
        int randomNumber = random.nextInt(jokes.length);    // Ensures that random number will be within bounds of
        // our array length

        System.out.println(jokes[randomNumber]);    // Prints a joke at random number index
    }
}
