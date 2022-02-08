package com.BntaAaronNazareth.Lessons.CH3_Java_Fundamentals_2.Week2_Wednesday;

public class ErrorHandling {
    public static void main(String[] args) {
        example1();

        int [] numbers = {1, 2, 3, 0, 4, 5};
        int result = 0;

        for (int number: numbers) {
            int add = number + 100;
            result += add;
        }
//        System.out.println(result);
    }

    private static void example1() {


        try {       // Try statement used to ensure that the code we write within is checked for errors while being
            // executed - we are using it because we anticipate potential errors
            int result = Integer.parseInt("10");
            System.out.println(result);

            int division = 10 / 0;
            System.out.println(division);

            int result2 = Integer.parseInt("Ten");
            System.out.println(result2);
        }
        catch (NumberFormatException e) {   // Catch statement used to handle number formatting errors
            System.out.println("Oops input is not a number");   // What we want displayed when a number format error
            // occurs - the program stops running at this point
        }
        catch (Exception e) {   // Catch statement used to handle number any error
            System.out.println("Catch all errors");     // What we want displayed when any error occurs - the program
            // stops running at this point
        }

        System.out.println("But this program still works");
    }
}
