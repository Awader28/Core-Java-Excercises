package com.internship.day03.inheritence.sharedvars;

import java.util.Scanner;

public class FullTimeEmployee extends Details{
	
	private float monthSal;

	public float getMonthSal() {
		return monthSal;
	}

	public void setMonthSal(float monthSal) {
		this.monthSal = monthSal;
	}
	
	Scanner S1=new Scanner(System.in);
	
	public void getFullTimeData(){
		
		System.out.println("ENTER ID: ");
		int eid=S1.nextInt();
		System.out.println("ENTER NAME: ");
		String nameString=S1.next();
		System.out.println("ENTER DESIGNATION: ");
		String desig=S1.next();
		System.out.println("ENTER DEPARTMENT: ");
		String deptt=S1.next();
		System.out.println("ENTER CITY: ");
		String city=S1.next();
		System.out.println("ENTER SALARY: ");
		float salary=S1.nextFloat();
		
		setEid(eid);
		seteNameString(nameString);
		setDesig(desig);
		setDeptt(deptt);
		setCityString(city);
		setMonthSal(salary);
	
		
		
	}
	public void display() {
		System.out.println("EID"+ getEid());
		System.out.println(geteNameString());
		System.out.println(getDesig());
		System.out.println(getDeptt());
		System.out.println(getCityString());
		System.out.println(getMonthSal());
		
	}
	
}
	
	
		



