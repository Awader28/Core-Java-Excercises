package com.internship.day10.singleton;

public class Caller {
	static final int id=10;
	public static void main(String[] args) {
//		Caller caller=new Caller();
//		Caller.id=20; //cannot change.
		Apple.PrintStuff(); 
		//final int a =89; //not able to modify a after 
//		a=90;
	}

}
