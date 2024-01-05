package com.internship.day12.multithreading;

public class MultiTDemo {

	public static void main(String[] args) throws InterruptedException {

		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();

		Demo1 d4 = new Demo1();

		d1.start();
		d2.start();
		d3.start();
		d4.start();
		System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+__+_+_+_+_+_+_+_+__+_+_+_+_+_+_+_+_+_+_+_+_+_+");
		System.out.println();
		System.out.println("My Thread Name is: " + d1.currentThread().getName());
		System.out.println("My Thread Id is: " + d1.currentThread().getId());
		System.out.println("My Thread Priority is : " + d1.currentThread().getPriority());
		System.out.println("Ny Thread is Alive? : " + d1.currentThread().isAlive());
		System.out.println("MY MIN PRIORITY IS: " + d1.MIN_PRIORITY);
		System.out.println("MY MAX PRIORITY IS: " + d4.MAX_PRIORITY);

		System.out.println("____________________________________________________________________________________--");
		System.out.println("My Thread Name is: " + d2.currentThread().getName());
		System.out.println("My Thread Id is: " + d2.currentThread().getId());
		System.out.println("My Thread Priority is : " + d2.currentThread().getPriority());
		System.out.println("Ny Thread is Alive? : " + d2.currentThread().isAlive());
		System.out.println("MY MIN PRIORITY IS: " + d2.MIN_PRIORITY);
		System.out.println("MY MAX PRIORITY IS: " + d4.MAX_PRIORITY);

		System.out.println("_______________________________________________________________________________________--");
		System.out.println("My Thread Name is: " + d4.currentThread().getName());
		System.out.println("My Thread Id is: " + d4.currentThread().getId());
		System.out.println("My Thread Priority is : " + d4.currentThread().getPriority());
		System.out.println("Ny Thread is Alive? : " + d4.currentThread().isAlive());
		System.out.println("MY MIN PRIORITY IS: " + d4.MIN_PRIORITY);
		System.out.println("MY MAX PRIORITY IS: " + d4.MAX_PRIORITY);
		System.out.println("_______________________________________________________________________________________--");

//		

	}

}
