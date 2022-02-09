package com.BntaAaronNazareth.Lessons.CH5_Intro_to_Data_Classes.Week4_Friday;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithArrayLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.indexOf(1));
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.contains(1));
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        // add back again

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (Object e : list) {
            System.out.println("e = " + e);
        }
    }
}
