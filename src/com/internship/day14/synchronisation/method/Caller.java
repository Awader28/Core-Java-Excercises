package com.internship.day14.synchronisation.method;

public class Caller {
	

	
	public static void main(String[] args) {
		
		Client c1 = new Client();
		Client1 c2= new Client1();
		Client2 c3= new Client2();
		
		c1.run();
		c2.run();
		c3.run();
		
		c1.setPriority(10);
	}

}
