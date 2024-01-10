package com.internship.day14.synchronisation.method;

public class Client2 extends Thread {

	public synchronized void run() {

		Demo2 d = new Demo2();

		d.demons();

	}

	/**
	 * 
	 */
	public Client2() {
		// TODO Auto-generated constructor stub
	}

}
