package com.internship.day12.multithreading;

public class Demo extends Thread {

	
	@Override
	public void run() {
		for (int i = 0; i < 45; i++) {
			try {
				System.out.println("INDIA: " + i );
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	void demons() throws InterruptedException {

		for (int i = 11; i < 21; i++) {
			System.out.println("value of i is: " + i + " II method");
			Thread.sleep(300);
		}

	}

}
