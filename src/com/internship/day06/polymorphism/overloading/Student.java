package com.internship.day06.polymorphism.overloading;

public class Student {
	
	void getData(int a) {
		System.out.println(a);
	} //same name differnt parameters
	
	void getData(int a, String b) {
		System.out.println(a+" "+b);
	} //same name different parameters
	
	void getData(String a, int b) {
		System.out.println(a+" "+b);
	} //same name different parameters
	
	public static void main(String[] args) {
		Student s2=new Student();
		s2.getData(20); //call
		s2.getData(10, "Atharva"); //call
		s2.getData("Atharva", 4); //call
	}

}
