package com.BntaAaronNazareth.Lessons.CH5_Intro_to_Data_Classes.Week4_Friday;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("red"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        System.out.println(balls.size());
        balls.add(new Ball("red")); // Duplicates not allowed in a set, so this is not added
        System.out.println(balls.size());
        balls.forEach(System.out::println);
        System.out.println("-------------");
        balls.remove(new Ball("yellow"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }

    record Ball(String color){}
}
