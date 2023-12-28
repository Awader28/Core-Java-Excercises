package com.internship.day06.polymorphism.overloading;

public class ConstructorOverloading {
	public ConstructorOverloading() {
		// TODO Auto-generated constructor stub
		System.out.println("I AM DEFAULT");
		
	}

	public ConstructorOverloading(int j) {
		// TODO Auto-generated constructor stub
		System.out.println("I AM SINGLE ARGUMENT PARAMISED CONSTRUCTOR I AM OVERLOADED");
	}

	public ConstructorOverloading(int a, String b) {
		// TODO Auto-generated constructor stub
		System.out.println("I AM MULTIPLE ARGUMENT PARAMISED CONSTRUCTOR I AM OVERLOADED");
	}

	public static void main(String[] args) {
		ConstructorOverloading overloading = new ConstructorOverloading();
		ConstructorOverloading overloading2=new ConstructorOverloading(10);
		ConstructorOverloading overloading3=new ConstructorOverloading(10, "Atharva");

	}

}
