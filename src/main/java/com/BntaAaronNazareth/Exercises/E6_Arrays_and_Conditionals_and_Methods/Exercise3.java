package com.BntaAaronNazareth.Exercises.E6_Arrays_and_Conditionals_and_Methods;

public class Exercise3 {
    /*
      Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
      You might compile and run the program via command line or by editing configuration and pass program arguments
    */
    public static void main(String[] args) {
        checkingIfEvenOrOdd(0);
        checkingIfEvenOrOdd(1);
        checkingIfEvenOrOdd(2);
        checkingIfEvenOrOdd(7);
        checkingIfEvenOrOdd(24);
    }

    public static void checkingIfEvenOrOdd(int number) {
        if (number %2 == 0) {
            System.out.println(number + " is an even number");
        }
        else {
            System.out.println(number + " is an odd number");
        }
    }
}
