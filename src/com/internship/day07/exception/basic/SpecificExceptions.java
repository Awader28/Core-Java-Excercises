package com.internship.day07.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SpecificExceptions {
	public static void main(String[] args) {
		int a = 0;
		int result = 0;
		int f = 0;
		String nameString;
		try {
			Scanner scanner = new Scanner(System.in);

			System.out.println("DIVISION");
			System.out.println("ENTER YOUR NAME: ");
			nameString=scanner.next();
			System.out.print("ENTER ONE NUMBER  ");

			a = scanner.nextInt();
			System.out.print("ENTER ANOTHER NUMBER: ");
			f = scanner.nextInt();

			result = a / f;
			System.out.println("NAME : "+nameString);
			System.out.println("res is: " + result);
		}catch(NullPointerException e) {
			System.out.println("STRING NOT BE NULL");
			
		}
		catch(InputMismatchException e) {
			System.out.println("ENTER NUMERIC VALUES PLEASE");
			
		}
		catch (ArithmeticException e) {
			System.out.println("DIVIDE BY ZERO, PLEASE ENTER ALL VALUES BUT 0 IN DENOMINATOR");
			// TODO: handle exception
		}
		catch (Exception e) {
			
			System.out.println("ERROR PLEASE ENTER NUMERIC");
		}

	}
}
