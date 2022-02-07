package com.BntaAaronNazareth.Exercises.E6_Arrays_and_Conditionals_and_Methods;

public class Exercise6 {
    /*
        Create a package called email
        Then have a method called validateEmail that return true of false if input is valid email
        Finally invoke validateEmail in main
            i.e. "hello@gmail.com" -> true
            i.e. "hellogmail.com" -> false
    */
    public static void main(String[] args) {
        validateEmail("hello@gmail.com");
        validateEmail("hellogmail.com");
    }

    public static void validateEmail(String email) {
        boolean isEmail = email.contains("@");
        System.out.println(isEmail);
    }
}
