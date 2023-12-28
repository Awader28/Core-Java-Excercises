package com.internship.day07.exception.basic;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int a = 0;
		int result = 0;
		int f = 0;
		try {
			System.out.println("DIVISION");
			System.out.print("ENTER ONE NUMBER  ");
			Scanner scanner = new Scanner(System.in);

			a = scanner.nextInt();
			System.out.print("ENTER ANOTHER NUMBER: ");
			f = scanner.nextInt();

			result = a / f;
			System.out.println("res is: " + result);
		} catch (Exception e) {
			
			System.out.println("ERROR PLEASE ENTER NUMERIC");
		}

	}
}
