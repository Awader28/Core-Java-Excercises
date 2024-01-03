package com.internship.day10.stack;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();

        // Creating instances of Student and Employee
        Student student1 = new Student("Alice", 101);
        Employee employee1 = new Employee("Bob", 201);

        // Pushing instances onto the stack
        System.out.println("PUSHED: "+ stack.push(student1));
        stack.push("PUSHED: "+stack.push(employee1));

        // Popping and displaying elements from the stack
//        while (!stack.isEmpty()) {
//            System.out.println("Popped: " + stack.pop());
//        }
        
    }
}
