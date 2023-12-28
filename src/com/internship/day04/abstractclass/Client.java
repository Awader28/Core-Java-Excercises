package com.internship.day04.abstractclass;

public class Client extends Employee {
	void data() {
		System.out.println("THIS IS DATA METHOD \n I WAS DECLARED IN ABSTRACT IN THE EMPLOYEE CLASS BUT I AM INSTANTIATED IN CLIENT CLASS");
	}
	
	public Client() {
		super(3);//this calls the employee parameterised constructor
		System.out.println(" I AM CLIENT DEFAULT");//this is the default
	}
	public Client(int x) {
		this();
		System.out.println(" I AM CLIENT PARAMISED"); 
	}
	
	

	public static void main(String[] args) {
		Client client=new Client();
		Client client1=new Client(3);
		//client.data();
		
//		Employee employee=new Client();
//		//employee.data();
		
	}

}
