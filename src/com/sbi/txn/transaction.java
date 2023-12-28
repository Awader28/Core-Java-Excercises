package com.sbi.txn;

public class transaction {
	
	int i;
	String h;
	
	static int ij;
	static String pq;
	
	public static void main(String[] args) {
		transaction tx= new transaction();
		
		System.out.println("THIS IS STATIC INTEGER: "+tx.i);
		System.out.println("THIS IS STATIC STRING: "+tx.h);
		System.out.println();
		System.out.println("THIS IS NON STATIC INTEGER: " +ij);
		System.out.println("THIS IS NON STATIC STRING: "+ pq);
		
	}

}
