package com.BntaAaronNazareth.Lessons.Java_Fundamentals_2;

public class Week2_Monday2 {
    public static void main(String[] args) {
        // TOPIC: Methods
        printLength("Aaron");
        printLength("Toby");
        printLength("Andrew");
        printLength("Tom");
    }
    static void printLength(String name) {
        int length = name.length();
        System.out.println(name + " is " + length + " letters long");
    }
}
