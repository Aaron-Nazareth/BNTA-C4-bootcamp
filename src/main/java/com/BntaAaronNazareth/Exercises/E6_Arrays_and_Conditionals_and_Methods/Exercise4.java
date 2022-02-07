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
        boolean prime = true;

        if (num < 2) {
            prime = false;
        }

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                prime = false;
                break;
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
