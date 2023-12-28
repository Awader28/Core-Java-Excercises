package com.statcon;

import java.util.Scanner;

public class Product {
	int id;
	String nameString;
	float price;
	String productString;
	static Product p1=new Product();
	
	static void getData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER ID: ");
		p1.id=sc.nextInt();
	}
	static void displayData() {
		System.out.println(p1.id);
	}

}
