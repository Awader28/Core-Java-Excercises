package com.internship.day04.interfaces;

public class Checker implements I1 {

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("hello I am from The interface");
	}
	public static void main(String[] args) {
		System.out.println("I AM MAIN \n");
		Checker checker=new Checker();
		checker.demo();

		I1 c1= new Checker();
		c1.demo();	
	}
}
