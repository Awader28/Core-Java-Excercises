package com.internship.day03.abstraction;

public class Product {
	private int pid;
	private String nameString;
	private int qty;
	private float cost;
	//getters and setters
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	//static block
	static {
		System.out.println("Static Block \n ___________________________________________");
	}
	//non static block
	{
		System.out.println("NON STATIC \n ______________________________________________ ");
		
	}
	public static void main(String[] args) {
		System.out.println("I am main");
	}

}
