package com.internship.day04;

public class Child extends Parent {
	
	private int childId;
	
	
	static {
		System.out.println("CHILD STATIC BLOCK I WILL EXECUTE BEFORE CONSTRUCTOR");
	}

	public Child() {
		System.out.println("I AM CHILD CONSTRUCTOR");
		// TODO Auto-generated constructor stub
	}
	

}
