package com.BntaAaronNazareth.Lessons.Java_Fundamentals_1;

import java.awt.Point;

public class Week1_Friday {
    public static void main(String [] args) {
//        // primitives
//        int age = 23;
//        short s = 30_000;
//        long l = 50_000_000;
//        double pi = 3.14159;
//        boolean is_adult = true;
//        char c = 'a';

        Point p1 = new Point(10, 10);
        Point p2 = p1;

        System.out.println(p1);
        System.out.println(p2);

        p2.x = 0;

        System.out.println(p1);
        System.out.println(p2);
    }
}
