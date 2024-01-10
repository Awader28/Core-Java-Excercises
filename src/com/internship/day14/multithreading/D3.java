package com.internship.day14.multithreading;

public class D3 extends Thread {
	public void run() {
		for (int i = 21; i <41 ; i++) {
			System.out.println("Value of I: "+i);
		}
	}
}
