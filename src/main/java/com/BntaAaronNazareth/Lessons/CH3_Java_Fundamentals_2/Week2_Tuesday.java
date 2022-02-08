package com.BntaAaronNazareth.Lessons.CH3_Java_Fundamentals_2;

import java.util.Scanner;

public class Week2_Tuesday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner input to read and store user inputs
        printQuestionOne(); // Invokes "printQuestionOne" method
        int number1 = scanner.nextInt();    // Calls scanner input and assigns it to variable "number1"
        printQuestionTwo(); // Invokes "printQuestionTwo" method
        int number2 = scanner.nextInt();    // Calls scanner input and assigns it to variable "number2"
        int result = add(number1, number2);     // Invokes "add" method using "number1" and "number2" as inputs, then
        // stores the result in variable "result"
        printAnswer(number1, number2, result);  // Invokes "printAnswer" method using "number1", "number2" and
        // "result" as inputs
    }

    public static int add(int num1, int num2) {     // Creates method for adding integer inputs "num1" and "num2"
        return num1 + num2;     // Returns output value to be called on
    }

    public static void printQuestionOne() {     // Creates method for printing question one
        System.out.println("Enter first number: ");
    }

    public static void printQuestionTwo() {     // Creates method for printing question two
        System.out.println("Enter second number: ");
    }

    public static void printAnswer(int n1, int n2, int result) {    // Creates method for printing a final answer
        System.out.println("-----Addition-----");
        System.out.println(n1 + " + " + n2 + " = " + result);
        System.out.println("Process complete");
    }
}
