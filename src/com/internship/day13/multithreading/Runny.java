package com.internship.day13.multithreading;

public class Runny extends  Thread{
	
public static void main(String[] args) {
	Runnable r1= new Runabley();
	Runnable r2= new Demo();
	
	Demo d= new Demo();
	Runabley runabley= new Runabley();
	
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	
	t1.start();
	t2.start();
}
	
	
	
	
}
