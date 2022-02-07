package com.BntaAaronNazareth.Exercises.E6_Arrays_and_Conditionals_and_Methods;
// Currently, this does not work :(
public class Exercise4 {
    /*
      Write a program that takes an input number from the console and prints if number is prime
      Create a method to check if number is prime then use against the input
    */
    public static void main(String[] args) {
     // Prime numbers are divisible only by 1 and themselves
        checkIfPrimeNumber(0);  // not prime
        checkIfPrimeNumber(1);  // not prime
        checkIfPrimeNumber(2);  // prime
        checkIfPrimeNumber(3);  // prime
        checkIfPrimeNumber(4);  // not prime
        checkIfPrimeNumber(5);  // prime
        checkIfPrimeNumber(6);  // not prime
        checkIfPrimeNumber(7);  // prime
        checkIfPrimeNumber(8);  // not prime
        checkIfPrimeNumber(9);  // not prime
        checkIfPrimeNumber(10); // not prime
    }

    public static void checkIfPrimeNumber(int num) {
        boolean prime = true;   // Set initial boolean for prime values as true - all num inputs assumed prime to begin
        // with

        if (num < 2) {  // We know prime numbers start a 2 so set prime boolean to false for all num inputs < 2
            prime = false;
        }

        for (int i = 2; i <= num/2; i++) {  // Loop through num inputs based on iterations from 2 to half the num
            // input
            if (num % i == 0) { // If any of the num inputs have no remainder when divided by a number, then they
                // aren't a prime
                prime = false;  // Set prime boolean to false
                break;  // Break since we have determined not a prime and don't want to continue looping
            }
        }
        if (prime) {
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
    }
}
