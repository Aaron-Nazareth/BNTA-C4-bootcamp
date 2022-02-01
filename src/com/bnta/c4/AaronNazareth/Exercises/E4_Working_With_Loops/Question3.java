package com.bnta.c4.AaronNazareth.Exercises.E4_Working_With_Loops;

public class Question3 {
    public static void main(String[] args) {
        // create a for loop which goes from 0 to 20
        // print each even value
        for (int i = 0; i <= 20 ; i++) {
            if (i == 0) {
                continue;   // Continue statement used to skip when i = 0
            }

            else if (i % 2 == 0) {      // Else if used to provide alternative condition - even numbers determined by
                // being divisible by 2 and having no remainder
                System.out.println(i);
            }
        }
    }
}
