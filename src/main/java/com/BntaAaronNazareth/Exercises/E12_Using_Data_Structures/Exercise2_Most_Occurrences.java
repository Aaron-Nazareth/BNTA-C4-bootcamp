package com.BntaAaronNazareth.Exercises.E12_Using_Data_Structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise2_Most_Occurrences {
    /*
     Given the following array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
     > Find the element that has the most occurrences
     > Your method should return something like the 1 since it occurs 4 times
     > Think about the data structure that you should use
     > Create a method. Think about the return type and parameters
     > Write unit tests for your method
    */
    public static void main(String[] args) {
        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
        Exercise2_Most_Occurrences exercise2_most_occurrences = new Exercise2_Most_Occurrences();   // Creates a new
        // instance of this exercise class, so we can invoke the method we made.
        exercise2_most_occurrences.mostOccurrences(input);  // Invokes our method, using the string input.
    }

    public List<String> mostOccurrences(String input) {
        Exercise1_Number_of_Occurrences number_of_occurrences = new Exercise1_Number_of_Occurrences();  // Invoke our
        // class from the previous exercise, so we can re-use the method.
        Map <String, Integer> map = number_of_occurrences.numberOfOccurrences(input);   // Create a new map that
        // contains the result of the previous exercise - numbers of all occurrences.

        int max = 0;    // Create placeholder for storing the max value as we loop through our map.
        List<String> list = new ArrayList<>();  // Create a new list for storing the relevant elements that occur most.
        for (Map.Entry<String, Integer> e : map.entrySet()) {   // Loops through each map entry/element
            // Compare value with max.
                // If greater, then replace current max value and key in list.
                // If equal, then add key to list.
            if (e.getValue() > max) {
                max = e.getValue(); // Replaces current max value with this value
                list.clear();   // Clears the list to make room for new element that occurs most
                list.add(e.getKey());   // Adds key to list
            }
            else if (e.getValue() == max) {
                list.add(e.getKey());   // Adds key to list
            }
        }
        System.out.println("-----------------");
        System.out.println("Most occurring string input is: " + list);
        return list;    // Returns list
    }
}
