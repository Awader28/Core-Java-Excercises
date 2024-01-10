package com.internship.day14.synchronisation.method;

public class Client extends Thread {
	
	public synchronized void run() {
		Demo d1= new Demo();
		
			d1.demo();
		
		
	}

	/**
	 * 
	 */
	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	

}
