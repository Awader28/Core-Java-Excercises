package com.internship.day12.multithreading.assignments;

public class Client implements Runnable {

	@Override
	public void run() { 
		// TODO Auto-generated method stub

		for (int i = 0; i < 11; i++) {
			System.out.println("TANGO: "+i);
		}
	}
	public void B(){
		
		for (int i = 0; i < 45; i++) {
			System.out.println("HELLO FROM CLIENT");
		}
		
	}

}
