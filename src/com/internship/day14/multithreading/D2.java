package com.internship.day14.multithreading;

public class D2 extends Thread {
	
	public void run() {
		for (int i = 11; i < 21; i++) {
			System.out.println("Value of I: "+i);
		}
	}

}
