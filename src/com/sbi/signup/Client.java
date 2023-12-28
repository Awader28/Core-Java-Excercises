package com.sbi.signup;

public class Client {
	{
		
		System.out.println("I AM NON STATIC BLOCK I WILL EXECUTE N TIMES");
		 
	}
	static {
		System.out.println("I AM STATIC BLOCK I EXECUTE ONLY ONCE");
	}
	
	public static void main(String[] args) {
		System.out.println("this is main method");
		Client c1= new Client();
		Client c2=new Client();//no static block executes n times
		Client c3=new Client();//no static block executes n times
	}

}
