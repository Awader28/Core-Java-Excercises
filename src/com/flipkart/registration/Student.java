package com.flipkart.registration;

public class Student {
	private int id;
	private String name;
	private String city;
	private double fees;
	
	public void data(int id, String name, String city,double fees) {
		this.id=id;
		this.name=name;
		this.city=city;
		this.fees=fees;
	}
	public void display() {
		System.out.println("id: "+id);
		System.out.println("name: "+ name);
		System.out.println("name: "+ city);
		System.out.println("fees paid: "+fees);
	}
	

}
