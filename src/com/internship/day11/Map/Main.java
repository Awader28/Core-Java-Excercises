package com.internship.day11.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Map<Integer, Student> m1 = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		do {
			Address a0 = new Address();
			Student s1 = new Student(a0, null);

			System.out.println("MENU:");
			System.out.println("1. Add Student");
			System.out.println("2. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("ENTER THE ADDRESS NAME OF STUDENT");
				String a1 = sc.next();
				s1.setSname(a1);

				System.out.println("ENTER THE CITY OF STUDENT");
				String c1 = sc.next();
				a0.setCityString(c1);

				System.out.println("ENTER THE PINCODE OF STUDENT");
				int c2 = sc.nextInt();
				a0.setPincode(c2);

				System.out.println("ENTER THE STATE OF STUDENT");
				String c3 = sc.next();
				a0.setState(c3);

				m1.put(m1.size() + 1, s1);
				System.out.println("Student added successfully!");
				break;

			case 2:
				exit = true;
				break;

			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}

		} while (!exit);

		System.out.println(
				"_____________________________________________________________________________________________________________\n");

		for (Entry<Integer, Student> m : m1.entrySet()) {

			System.out.println(m.getKey() + "::" + m.getValue());

		}
		System.out.println(
				"_____________________________________________________________________________________________________________\n");

		System.out.println("I am also ouput only \n");
		System.out.println("Final Students' Information:");
		System.out.println(m1 + "\n");
	}
}
