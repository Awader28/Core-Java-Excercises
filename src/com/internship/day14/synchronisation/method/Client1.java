package com.internship.day14.synchronisation.method;

public class Client1 extends Thread {
	
	public synchronized void run() {
		Demo1 d2= new Demo1();
		
			d2.demos();
		
	}

	/**
	 * 
	 */
	public Client1() {
		// TODO Auto-generated constructor stub
	}
	

}
