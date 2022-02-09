package com.BntaAaronNazareth.Exercises.E12_Using_Data_Structures;

import java.util.HashMap;
import java.util.Map;

public class Exercise1_Number_of_Occurrences<Static> {
    /*
     Given the following array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
     > Find the number of occurrences for each element
     > Think about the data structure that you should use
     > Create a method. Think about the return type and parameters
     > Write unit tests for your method
    */
    public static void main(String[] args) {
        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
        Exercise1_Number_of_Occurrences result = new Exercise1_Number_of_Occurrences(); // Creates a new instance of
        // this exercise class, so we can invoke the method we made.
        result.numberOfOccurrences(input);  // Invokes our method, using the string input.

//        numberOfOccurrences(input); // If we had a static method below, then we could invoke it this way. However, we
//        // have opted for a non-static method for re-usability outside this class.
    }


    public Map<String, Integer> numberOfOccurrences(String input) {
        String[] elements = input.split(",");
        Map<String, Integer> map = new HashMap<>();



        for (String e : elements) {
            // Check for key
            // If no key, then add key for element and assign value of 1.
            // Else, add to a count that will become the new value in our map (current value + 1).
            if (input == "") {
                break;
            }

            if (!map.containsKey(e)) {  // If no key for element
                map.put(e, 1);  // Creates new key in map, with value of 1
            }
            else {
                int count = map.get(e) + 1; // Makes a count variable, which is equal to the current key value + 1
                map.put(e, count);  // Reassigns new value to the key
            }
        }
        map.entrySet().forEach(System.out::println);    // entrySet returns a set view of the map, which we then loop
        // through and print each K-V element of
        System.out.println("-----------------");
        System.out.println(map);    // Alternatively, we can print the map in one go
        return map; // Returns expected data type to execute method
    }
}
