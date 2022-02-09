package com.BntaAaronNazareth.Lessons.CH5_Intro_to_Data_Classes.Week4_Tuesday;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Aaron"));
        map.put(2, new Person("Tom"));
        map.put(3, new Person("Andrew"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.entrySet().forEach(System.out::println);    // Entry set returns a set view of the entries in our map
        System.out.println(map.getOrDefault(4, new Person("default"))); // Returns value of key if it exists. If it
        // doesn't exist then the default is returned instead.
        System.out.println(map.getOrDefault(3, new Person("default2")));
    }

    record Person(String name){}    // Record is an immutable data class that requires only the type and name of fields
}
