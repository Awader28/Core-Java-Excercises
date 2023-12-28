package com.internship.day01;

import java.util.Scanner;

public class AS01 
{
public static void main(String[] args)
{
	int a;
	int b;
	int res;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ENTER ONE NUMBER: ");
	a=sc.nextInt();
	System.out.println("ENTER ANOTHER NUMBER: ");
	b=sc.nextInt();
	
	boolean wanQuit=true;
	int choice;
	System.out.println("ENTER CHOICE \n 1 for add \n 2 for sub \n 3 for mul and 4 for div");
	choice=sc.nextInt();
	
	do {
		switch(choice) {
		case 1 : 
			res=a+b;
			System.out.println("addd is" +res);
			break;
		case 2:
			res=a-b;
			System.out.println("SUB IS" + res);
			break;
		case 3:
			res=a*b;
			
			System.out.println("MUL IS" + res);
			break;
		case 4:
			res=a/b;
			System.out.println("DIV IS: " + res);
			break;
		}
		System.out.println("Hello Again, Enter choice");
		choice=sc.nextInt();
	} while(choice!=0);
	
	System.out.println("PROG ENDED:");
	
}
	
	

}
