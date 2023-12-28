package com.internship.day04.abstractexxpl;

import java.util.Scanner;

public class PartTime extends Details{
	float hSalary;
	Scanner sc= new Scanner(System.in);
	@Override
	void getPartData() {
		// TODO Auto-generated method stub
        System.out.println("ENTER ID :");
        int eIds = sc.nextInt();
        System.out.println("ENTER NAME: ");
        String nameString = sc.next();
        System.out.println("ENTER CITY: ");
        String cityString = sc.next();
        System.out.println("ENTER SALARY");
        hSalary = sc.nextFloat();

        setCity(cityString);
        seteId(eIds);
        setName(nameString);
	}

	@Override
	void setPartdata() {
		// TODO Auto-generated method stub
        System.out.println(geteId());
        System.out.println(getName());
        System.out.println(getCity());
        System.out.println(hSalary);
	}

	@Override
	void getFullData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void setFulldata() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
