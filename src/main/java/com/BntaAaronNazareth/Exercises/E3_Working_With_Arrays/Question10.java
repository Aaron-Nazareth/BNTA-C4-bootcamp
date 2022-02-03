package com.BntaAaronNazareth.Exercises.E3_Working_With_Arrays;

public class Question10 {
    public static void main(String[] args) {
        // start from your solution to Q5
        // create a String variable called `condition` which has the value "c"
        // create a Boolean variable called `hasC` which has the value `false`
        // create a `for` loop which goes through each item in our array, comparing it against our `condition` variable
        // if the two are equal, change the `hasC` value to `true`
        // once the `for` loop concludes, print out a message which tells you if `hasC` is `true` or `false`
        String[] array = new String[] {"a", "b", "c", "d"};
        String condition = "c";
        boolean hasC = false;

        for (String letter: array) {
            if (letter.equals(condition)) { // Compares the two strings - value at each index vs our condition
                hasC = true;
                break;
            }
        }
        System.out.println(hasC);
    }
}
