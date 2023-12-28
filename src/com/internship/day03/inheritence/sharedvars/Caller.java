package com.internship.day03.inheritence.sharedvars;

import java.util.Scanner;

public class Caller{
	
	public static void main(String[] args) {
		int choice;
		System.out.println(" \n ENTER CHOICE\n 1 for Full Time Data Entry \n 2 for Part Time Data Retrieval \n 3 for Full time Data Retrieval \n 4 for Part Time Data Retrieval \n 5 for All Employees \n 6 to display" );
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		FullTimeEmployee f1=new FullTimeEmployee();
		PartTimeEmployee p1=new PartTimeEmployee();
		do {
			switch(choice) {
				case 1: 
					f1.getFullTimeData();
					System.out.println("WANT TO CONTINUE?");
					System.out.println(" \n ENTER CHOICE\n 1 for Full Time Data Entry \n 2 for Part Time Data Retrieval \n 3 for Full time Data Retrieval \n 4 for Part Time Data Retrieval \n 5 for All Employees \n 6 to display" );
					choice=sc.nextInt();
					break;
					
				case 2:
					p1.getPartTimeData();
					System.out.println("WANT TO CONTINUE?");
					System.out.println(" \n ENTER CHOICE\n 1 for Full Time Data Entry \n 2 for Part Time Data Retrieval \n 3 for Full time Data Retrieval \n 4 for Part Time Data Retrieval \n 5 for All Employees \n 6 to display" );

					choice=sc.nextInt();
					break;
				case 3:
					f1.display();
					System.out.println("WANT TO CONTINUE?");
					System.out.println(" \n ENTER CHOICE\n 1 for Full Time Data Entry \n 2 for Part Time Data Retrieval \n 3 for Full time Data Retrieval \n 4 for Part Time Data Retrieval \n 5 for All Employees \n 6 to exit" );
					choice=sc.nextInt();
					break;
				case 4:
					p1.displayPartTime();
					System.out.println(" \n ENTER CHOICE\n 1 for Full Time Data Entry \n 2 for Part Time Data Retrieval \n 3 for Full time Data Retrieval \n 4 for Part Time Data Retrieval \n 5 for All Employees \n 6 to display" );
					System.out.println("WANT TO CONTINUE?");
					choice=sc.nextInt();
					break;
			
				
			}
		}while(choice!=5);
		
	}

}
