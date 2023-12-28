package com.internship.day04.interfaces;

public class Paper implements I1 {

	@Override
	public void demo() {
		System.out.println("Hello I am demo I am from Interface");
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		System.out.println("I am Main");
		Paper paper=new Paper();
		paper.demo();

	}

}
