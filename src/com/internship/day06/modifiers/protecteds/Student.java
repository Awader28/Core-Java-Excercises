package com.internship.day06.modifiers.protecteds;

public class Student {
	
	protected int id;
	protected String nameString;
	
	//protected is allowed to access within the same class
	
	void demo() {
		System.out.println(id=192);
		System.out.print(nameString="Atharva");
		//as id and string are protected then they are acessible in the same class
	}
	
	public static void main(String[] args) {
		Student student=new Student();
		student.demo();
	}

}
