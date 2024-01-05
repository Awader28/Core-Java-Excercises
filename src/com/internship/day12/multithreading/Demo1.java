package com.internship.day12.multithreading;

public class Demo1 extends Thread {
	
	@Override
	public void run() {
		for (int i = 45; i < 90; i++) {
			try {
				System.out.println("CHARLIE  " + i );
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
