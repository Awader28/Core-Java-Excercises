package com.internship.day12.multithreading.assignments;

import com.internship.day12.runnable.Boss;
import com.internship.day12.runnable.Client;
import com.internship.day12.runnable.Employee;

public class Caller {
	public static void main(String[] args) {
		Runnable r1= new Employee();
		Runnable r2= new Client();
		Runnable r3= new Boss();
		
		Thread t1= new Thread(r1);
		Thread t2= new Thread(r2);
		Thread t3= new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
		Boss b= new Boss();
		Client c = new Client();
		Employee e = new Employee();
		
		Thread t4= new Thread(b);
		Thread t5= new Thread(c);
		Thread t6= new Thread(e);
		
		t4.start();
		t5.start();
		t6.start();
		
		
		
		
		
	}

}
