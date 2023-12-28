package com.internship.day03.inheritence.sharedvars;

import java.util.Scanner;

public class PartTimeEmployee extends Details{
	float hourSal;
	public float getHourSal() {
		return hourSal;
	}
	public void setHourSal(float hourSal) {
		this.hourSal = hourSal;
	}
	
	Scanner S1=new Scanner(System.in);
	public void getPartTimeData(){
		
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
		System.out.println("ENTER HOURLY SALARY: ");
		float salary=S1.nextFloat();
		
		setEid(eid);
		seteNameString(nameString);
		setDesig(desig);
		setDeptt(deptt);
		setCityString(city);
		setHourSal(salary);
	
		
		
	}
	public void displayPartTime() {
		System.out.println(getEid());
		System.out.println(geteNameString());
		System.out.println(getDesig());
		System.out.println(getDeptt());
		System.out.println(getCityString());
		System.out.println(getHourSal());
		
	}

}
