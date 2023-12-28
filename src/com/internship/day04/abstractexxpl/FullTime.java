package com.internship.day04.abstractexxpl;

import java.util.Scanner;

public class FullTime extends Details {
    float mSalary;
    Scanner sc = new Scanner(System.in);

    @Override
    void getFullData() {
        System.out.println(geteId());
        System.out.println(getName());
        System.out.println(getCity());
        System.out.println(mSalary);
    }


    @Override
    void setFulldata() {
        System.out.println("ENTER ID :");
        int eIds = sc.nextInt();
        System.out.println("ENTER NAME: ");
        String nameString = sc.next();
        System.out.println("ENTER CITY: ");
        String cityString = sc.next();
        System.out.println("ENTER SALARY");
        mSalary = sc.nextFloat();

        setCity(cityString);
        seteId(eIds);
        setName(nameString);
    }

   

    public static void main(String[] args) {
        System.out.println("OBJECTS CREATED");
    }


	@Override
	void getPartData() {
		// TODO Auto-generated method stub
		
	}


	@Override
	void setPartdata() {
		// TODO Auto-generated method stub
		
	}


	
}