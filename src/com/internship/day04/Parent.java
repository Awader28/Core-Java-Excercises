package com.internship.day04;

/**
 * 
 */
public class Parent {
	
	private int parentId;
	private String parentName;
	private String parentrole;
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getParentrole() {
		return parentrole;
	}
	public void setParentrole(String parentrole) {
		this.parentrole = parentrole;
	}
	
	static {
		System.out.println("this is static block of parent class");
	}
	
	{
		System.out.println("NON STATIC PARENT I OCCUR FIRST");
	}
	public Parent() {
		System.out.println("NON STATIC CONSTRUCTOR");
	}
	
	Parent parent=new Parent();
	
	//one cannot access data from child class
	//only borrower can access
	
	
	
	

}
