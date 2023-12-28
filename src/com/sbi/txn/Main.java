package com.sbi.txn;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student st=new Student();
		Scanner sc=new Scanner(System.in);
	
			System.out.println("ENTER NAME: ");
			st.nameString = sc.nextLine();
			System.out.print("ENTER ROLL NUMBER: ");
			st.rollNo = sc.nextInt();
			System.out.print("ENTER BRANCH: ");
			st.branchString = sc.next();
			System.out.print("ENTER CITY: ");
			st.cityString = sc.next();
			System.out.print("ENTER PERCENTAGE: ");
			st.percentage = sc.nextFloat();
			
			System.out.println("###########################");
			
			System.out.println("ROLL NO IS: " + st.rollNo);
			System.out.println("NAME IS: " + st.nameString);
			System.out.println("BRANCH IS: " + st.branchString);
			System.out.println("CITY IS: " + st.cityString);
			System.out.println("PRECENT IS: " + st.percentage);
			System.out.println("###########################");
		
		
		
	}

}
