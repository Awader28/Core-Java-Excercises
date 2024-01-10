package com.internship.day14.multithreading;

public class D1 extends Thread{
	public void run() {
		for(int i=0;i<11;i++) {
			System.out.println("Value of i Is: "+ i);
		}
	}


}
