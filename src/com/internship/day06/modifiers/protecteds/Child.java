package com.internship.day06.modifiers.protecteds;

public class Child extends Student {
	
//same package subclass
	
	void data() {
		System.out.println(id);
		System.out.println(nameString);
	}
	public static void main(String[] args) {
		Child child=new Child();
		child.id=123;
		child.nameString="AtharvaWader";
		child.data();
		child.demo();
	}
}
