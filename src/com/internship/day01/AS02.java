package com.internship.day01;

public class AS02 {
	int cId;
	String cName; //must create a class object if the variables are not static
	short s1;
	double d;
	float f;
	byte b;
	boolean bu;
	
	public static void main(String[] args) {
		AS02 a=new AS02(); //hence we created this object 
		System.out.println("Value of integer is: "+ a.cId);
		System.out.println("Value of string is: "+ a.cName);
		System.out.println("Value of double is: "+ a.d);
		System.out.println("Value of byte is: "+ a.b);
		System.out.println("Value of float is: "+ a.f);
		System.out.println("Value of boolean "+a.bu);
		
		
	}
}
