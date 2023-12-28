package com.internship.day03.abstraction;

public class Client {
	public static void main(String[] args) {

		Product product=new Product();
		product.setPid(101);
		product.setNameString("Keyboard");
		product.setCost(12345.654f);
		product.setQty(500);
		
		
		System.out.println(" ID IS: "+ product.getPid());
		System.out.println("NAME IS : "+ product.getNameString());
		System.out.println("COST IS: "+ product.getCost());
		System.out.println("QUANTITY IS: "+ product.getQty());
	}
	
	
	

}
