package com.internship.day03.inheritance.constructors;

public class Child extends Parent{

	public Child() {
		super(10); //calls parent parameterised after default
		System.out.println("I AM CHILD CLASS DEFAULT");
		// TODO Auto-generated constructor stub
	}
	public Child(int x) {
		this(); //calls this parameterised constructor
		System.out.println("I AM CHILD CLASS PARAMISED");
		// TODO Auto-generated constructor stub
	}
	

}
