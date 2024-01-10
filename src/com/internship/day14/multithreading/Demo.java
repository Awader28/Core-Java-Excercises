package com.internship.day14.multithreading;

public class Demo {
	public static void main(String[] args) {
		D1 d1 = new D1();
		D1 d2 = new D1();
		D1 d3 = new D1();
		d1.start();

		d1.run();
		
		d2.run();
		d3.run();

		D2 d4 = new D2(); 
		D2 d5 = new D2();
		D2 d6 = new D2();

		d4.run();
		d5.run();
		d6.run();

		D3 d7 = new D3();
		D3 d8 = new D3();
		D3 d9 = new D3();

		d7.run();
		d8.run();
		d9.run();

		d1.stop();
		d6.stop();
		d9.stop();
	}

}
