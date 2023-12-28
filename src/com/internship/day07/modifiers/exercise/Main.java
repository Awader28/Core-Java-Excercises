package com.internship.day07.modifiers.exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		FullTime f1 = new FullTime();
		PartTime p1 = new PartTime();
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				" \n ENTER CHOICE\n 1 for Full Time Data Entry \n 2 for Part Time Data Retrieval \n 3 for Full time Data Retrieval \n 4 for Part Time Data Retrieval \n 5 to exit");
		choice = sc.nextInt();
		do {
			switch (choice) {
			case 1:
				f1.setData();
				System.out.println(
						" \n ENTER CHOICE\n 1 for Full Time Data Entry \n 2 for Part Time Data Retrieval \n 3 for Full time Data Retrieval \n 4 for Part Time Data Retrieval \n 5 to exit");
				choice = sc.nextInt();
				break;

			case 2:
				p1.setData();
				System.out.println(
						" \n ENTER CHOICE\n 1 for Full Time Data Entry \n 2 for Part Time Data Entry \n 3 for Full time Data Retrieval \n 4 for Part Time Data Retrieval \n 5to exit");
				choice = sc.nextInt();
				break;
			case 3:
				f1.getData();
				System.out.println(
						" \n ENTER CHOICE\n 1 for Full Time Data Entry \n 2 for Part Time Data Retrieval \n 3 for Full time Data Retrieval \n 4 for Part Time Data Retrieval \n 5 to exit");
				choice = sc.nextInt();
				break;
			case 4:
				System.out.println(
						" \n ENTER CHOICE\n 1 for Full Time Data Entry \n 2 for Part Time Data Retrieval \n 3 for Full time Data Retrieval \n 4 for Part Time Data Retrieval \n 5 to exit");
				p1.getData();
				choice = sc.nextInt();
				break;

			}
		} while (choice != 5);
		System.out.println("EXITED THANK YOU");
		// as the main method only contains calls, we have achieved abstraction
	}

}
