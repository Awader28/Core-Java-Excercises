package com.internship.day12.runnable;

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
		
	}

}
