package com.internship.day06.modifiers.privates;

public class Private {

	private int id=100;
	
	void add() {
		System.out.println(id);
	}//same class allowed to access in private
	//direct or creation of object allowed.
	
	public static void main(String[] args) {
		Private p=new Private();
		p.add();
	}
}
