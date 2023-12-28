package com.internship.day06.polymorphism.examples;

public class Child extends Parent {
	
	void data() {
		System.out.println("HAHA I AM CHILD");
	}
	public static void main(String[] args) {
		Parent p1= new Child();
		p1.data();
	}

}
