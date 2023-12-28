package com.internship.day06.functionalinterface;

@FunctionalInterface
public interface Demo {
	void demo();
	
	static void data() {
		System.out.println("DATA METHOD");
	}
	
	default void Display() {
		System.out.println("Using Default, This method was defined in the Demo INTERFACE");
	}

}
