package com.internship.day07.modifiers.exercise;

import java.util.Scanner;

public class PartTime extends Data {
	int Hsalary;
	Scanner sc = new Scanner(System.in);

	public int getHsalary() {
		return Hsalary;
	}

	public void setHsalary(int hsalary) {
		Hsalary = hsalary;
	}

	@Override
	void setData() {
		// TODO Auto-generated method stub
		System.out.println("Enter ID: ");
		int eid = sc.nextInt();
		System.out.println("ENTER NAME: ");
		String eName = sc.next();
		System.out.println("ENTER BASE SALARY");
		float salary = sc.nextFloat();
		System.out.println("ENTER ");
		String designa = sc.next();
		System.out.println("ENTER CITY");
		String cityString = sc.next();
		System.out.println("ENTER STATE");
		String stateString = sc.next();
		System.out.println("ENTER HOURLY SALARY");
		int Hsalary = sc.nextInt();
		setId(eid);
		setName(eName);
		setSalary(salary);
		setDesignation(designa);
		setCityString(cityString);
		setStateString(stateString);
		setHsalary(Hsalary);
	}

	@Override
	void getData() {
		// TODO Auto-generated method stub
		System.out.println("Name: " + getName());
		System.out.println("ID: " + getId());
		System.out.println("BASE SALARY: " + getSalary());
		System.out.println("DESIGNATION: " + getDesignation());
		System.out.println("CITY: " + getCityString());
		System.out.println("STATE: " + getStateString());
		System.out.println("HOURLY SALARY: " + getHsalary());
	}

}
