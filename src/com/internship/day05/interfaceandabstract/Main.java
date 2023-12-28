package com.internship.day05.interfaceandabstract;

import java.util.Scanner;

public class Main extends Definations {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Definations definations = new Main();
		Scanner scanner = new Scanner(System.in);
		int choice;
		I1.Test();
		do {
			System.out.println("Menu:");
			System.out.println("1. Set Customer Data");
			System.out.println("2. Get Customer Data");
			System.out.println("3. Set Flight Data");
			System.out.println("4. Get Flight Data");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				definations.setCustomerData();
				break;
			case 2:
				definations.getCustomerData();
				break;
			case 3:
				definations.setFlightData();
				break;
			case 4:
				definations.getFlightData();
				break;
			case 5:
				System.out.println("Exiting the program. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		} while (choice != 5);

	}

}
