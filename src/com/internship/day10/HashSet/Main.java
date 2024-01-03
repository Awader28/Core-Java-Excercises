/**
 * 
 */
package com.internship.day10.HashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Employee1> e1 = new HashSet<Employee1>();
		Employee1 employee1= new Employee1("Atharva", 101, "HR Head", 12354);
		Employee1 employee2= new Employee1("Atharva", 101, "HR Head", 12354);
		
		e1.add(employee1);
		e1.add(employee2);
		
		System.out.println(e1);
	

	}

}
