package com.internship.day03.inheritence.multilevel;

public class Grandchild extends Child {

	public Grandchild() {
		System.out.println("I AM GRANDCHILD");
		// TODO Auto-generated constructor stub
	}

	public Grandchild(int j) {
		super(j);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		Grandchild grandchild=new Grandchild();
	}
	

}
