package com.internship.day12.multithreading.assignments;

public class Boss implements Runnable {

	@Override
	public void run() {
		for (int k = 22; k < 44; k++) {
			// TODO Auto-generated method stub
			System.out.println("CHARLIE :" + k);
		}
	}
	
	public void A() {
		for (int i = 0; i < 15; i++) {
			System.out.println("HELLO FROM BOSS");
		}
	}
	
	

}
