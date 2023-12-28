package com.flipkart.registration;

public class Encapsulation {
	
	private int id;
	private String name;
	private String city;
	private double fees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public Encapsulation(int id, String name, String city, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.fees = fees;
	}
	static {}
	{}
	public Encapsulation() {
		super();
		//constructor stub
	}
	public void demo() {}
	//this is the Encapsulation
	
	
	

}
