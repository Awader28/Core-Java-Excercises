package com.internship.day12.multithreading.assignments;

public  class Employee implements Runnable {

	@Override
	public void run() {
		for (int j = 11; j < 21; j++) {
			// TODO Auto-generated method stub
			System.out.println("INDIA: " + j);
		}
	}
	
	public void C() {
		for (int i = 0; i < 65; i++) {
			System.out.println("HELLO FROM C");
		}
	}
	
	


}
