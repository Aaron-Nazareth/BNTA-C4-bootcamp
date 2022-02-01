package com.bnta.c4.AaronNazareth.Exercises.E6_Arrays_and_Conditionals_and_Methods;

public class Exercise2 {
    /*
      Given the following String input:
      String input = "   b ri   ght net   work  "
      Write a program that transforms input into: Bright Network
    */
    public static void main(String[] args) {
        String input = "   b ri   ght net   work  ";
        String inputNoSpaces = input.replaceAll("\\s","");  // Replaces all spaces with an empty string, thus
        // removing them
        String inputTwoSeparateWords = inputNoSpaces.replace("bright", "bright ");  // Replaces "ht" with "ht " in order
        // to create spacing we want at that specific point
        String capitalisedResult = inputTwoSeparateWords.replace("b", "B").replace("n", "N");   // Replaces "b" with
        // "B" and "n" with "N" to capitalise first letter of each word
        System.out.println(capitalisedResult);
        }
    }
