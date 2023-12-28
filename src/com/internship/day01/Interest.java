package com.internship.day01;

import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER PRINCIPAL AMOUNT: ");
		int p=sc.nextInt();
		System.out.print("ENTER DURATION AMOUNT: ");
		int n=sc.nextInt();
		System.out.print("ENTER RATE AMOUNT: ");
		int r=sc.nextInt();
		double interest=p*n*r/100;
		System.out.println("INTEREST IS: "+ interest);
		
		System.out.println("ENTER RADIUS");
		int radius=sc.nextInt();
		double area=Math.PI*(Math.pow(radius, 2));
		System.out.println("AREA IS: "+area);
	}

}
