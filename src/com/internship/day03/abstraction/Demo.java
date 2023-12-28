package com.internship.day03.abstraction;

public class Demo {
	public static void main(String[] args) {
		Employee e= new Employee();
		
		System.out.println("I am the main method, welcome to the program");
		
		e.setCity("Pune"); //this is the method of the Employee Class!  
		e.setDesig("Jr.Developer");
		e.setEmpId(01012);
		e.setSalary(12345.12354f);
		e.setName("Atharva");
		
		System.out.println("This is the static method \n THE CITY IS: "+Employee.City());
		System.out.println("___________________________________________________________");
		System.out.println("This is the static variable \n THE VALUE OF PI IS: "+Employee.pi);
	
		System.out.println("___________________________________________________________");
		System.out.println("This is the non static variable accessed via getter \n THE VALUE OF CITY IS: "+e.getCity());
	
		System.out.println("___________________________________________________________");
		System.out.println("This is the non static variable accessed via getter\n THE VALUE OF DESIGNATION IS: "+e.getDesig());

		System.out.println("___________________________________________________________");
		System.out.println("This is the non static variable  accessed via getter\n THE VALUE OF EMPLOYEE ID  IS: "+e.getEmpId());

		System.out.println("___________________________________________________________");
		System.out.println("This is the non static variable accessed via getter \n THE VALUE OF SALARY IS: "+e.getSalary());

		System.out.println("___________________________________________________________");
		System.out.println("This is the non static variable  accessed via getter\n THE VALUE OF NAME IS: "+e.getName());
	}

}
