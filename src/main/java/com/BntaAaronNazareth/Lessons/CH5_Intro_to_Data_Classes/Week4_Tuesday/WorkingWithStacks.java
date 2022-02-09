package com.BntaAaronNazareth.Lessons.CH5_Intro_to_Data_Classes.Week4_Tuesday;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());   // Retrieves element at top of stack
        System.out.println(stack.size());
        System.out.println(stack.pop());    // Removes element from top of stack
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.empty());  // Checks if stack is empty and returns boolean response
    }
}
