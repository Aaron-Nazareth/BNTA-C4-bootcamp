package com.BntaAaronNazareth.Exercises.E5_Writing_Methods;

public class Exercise2 {
    public static void main(String[] args) {
        /*
         Write a method which takes a number as an argument and returns that number negated, e.g. passing 5 as an
         argument should return -5; passing -10 should return 10.
        */
        negatesNumber(5);
        negatesNumber(-10);
    }

    public static void negatesNumber(int number) {
        int negated = -number;
        System.out.println(negated);
    }
}
