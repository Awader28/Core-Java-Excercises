package com.internship.day06.modifiers.defaults;

public class Deafults {
	
	int id=10;
	String nameString="Jethalal";
	
	void data() {
		System.out.println(id);
		System.out.println(nameString);
	}
	
	public static void main(String[] args) {
		Deafults d=new Deafults();
		d.data();
		
	}

}
