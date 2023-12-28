package com.internship.day04.innerclass;

public class Demo {
    private int outerVar;

    public Demo() {
        this.outerVar = 10;
    }

    // Inner class within Demo
    class InnerDemo {
        private int innerVar;

        public InnerDemo() {
            this.innerVar = 20;
        }

        public void display() {
            System.out.println("Outer variable: " + outerVar);
            System.out.println("Inner variable: " + innerVar);
        }
    }

    public static void main(String[] args) {
        Demo outerObj = new Demo();
        Demo.InnerDemo innerObj = outerObj.new InnerDemo();

        // Type casting the innerObj to Object class
        Object obj = (Object) innerObj;

        // Type casting back to InnerDemo
        Demo.InnerDemo castedInnerObj = (Demo.InnerDemo) obj;
        castedInnerObj.display();
    }
}