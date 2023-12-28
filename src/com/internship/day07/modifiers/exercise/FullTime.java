package com.internship.day07.modifiers.exercise;

import java.util.Scanner;

public class FullTime extends Data {
	int Msalary;
	// we are inheriting Data class
	Scanner sc = new Scanner(System.in);

	void setData() {
		// TODO Auto-generated method stub
		System.out.println("Enter ID: ");
		int eid = sc.nextInt();
		System.out.println("ENTER NAME: ");
		String eName = sc.next();
		System.out.println("ENTER SALARY");
		float salary = sc.nextFloat();
		System.out.println("ENTER ");
		String designa = sc.next();
		System.out.println("ENTER CITY");
		String cityString = sc.next();
		System.out.println("ENTER STATE");
		String stateString = sc.next();
		System.out.println("ENTER MONTHLY SALARY");
		int Msalary = sc.nextInt();
		setId(eid);
		setName(eName);
		setSalary(salary);
		setDesignation(designa);
		setCityString(cityString);
		setStateString(stateString);
		setMsalary(Msalary);
	}

	public int getMsalary() {
		return Msalary;
	}

	public void setMsalary(int msalary) {
		Msalary = msalary;
	}

	void getData() {
		// TODO Auto-generated method stub
		System.out.println("NAME: " + getName());
		System.out.println("ID+ " + getId());
		System.out.println("BASE SALARY " + getSalary());
		System.out.println("DESIGNATION " + getDesignation());
		System.out.println("CITY:  " + getCityString());
		System.out.println("STATE " + getStateString());
		System.out.println("SALARY" + getMsalary());
	}

}
