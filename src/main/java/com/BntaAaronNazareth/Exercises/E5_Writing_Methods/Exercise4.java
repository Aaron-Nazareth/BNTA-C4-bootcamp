package com.BntaAaronNazareth.Exercises.E5_Writing_Methods;

public class Exercise4 {
    public static void main(String[] args) {
        /*
         Write a method which takes two numbers as arguments and prints one of:
        > "The first number is larger"
        > "The second number is larger"
        > "The numbers are equal"
        as appropriate.
        */
        largerNumberComparison(125, 34);
        largerNumberComparison(26, 822);
        largerNumberComparison(4,4);
    }
    public static void largerNumberComparison(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("The first number is larger");
        }
        else if (num2 > num1) {
            System.out.println("The second number is larger");
        }
        else {
            System.out.println("The numbers are equal");
        }
    }
}
