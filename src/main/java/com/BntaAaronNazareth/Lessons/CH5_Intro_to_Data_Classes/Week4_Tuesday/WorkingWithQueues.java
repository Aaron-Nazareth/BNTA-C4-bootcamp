package com.BntaAaronNazareth.Lessons.CH5_Intro_to_Data_Classes.Week4_Tuesday;

import com.BntaAaronNazareth.Lessons.CH4_Object_Oriented_Programming_1.Week2_Friday.Person;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Aaron", 23));
        supermarket.add(new Person("Tom", 23));
        supermarket.add(new Person("Andrew", 27));
        supermarket.add(new Person("Toby", 33));

        System.out.println(supermarket.size()); // Returns the number of elements in the queue
        System.out.println(supermarket.peek()); // Retrieves element at top of queue
        System.out.println(supermarket.poll()); // Removes element from top of queue
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }
}
