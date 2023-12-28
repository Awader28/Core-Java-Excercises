package com.internship.day03.abstraction;

public class Employee {
	private int empId;
	private String name;
	private String desig;
	private float salary;
	private String city;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	static {
		System.out.println("This is the static block");
		System.out.println("______________________________________________");
	}
	
	{
		System.out.println("This is the non static block");
		System.out.println("_________________________________________________");
	}
	static float pi=(float)3.14;
	static String state="Maharashtra";
	
	
	static String City(){
		return "Pune";
		
	}
	public static void main(String[] args) {
		System.out.println("I am the main method, welcome to the program");
		
		Employee e=new Employee();
		Employee e2=new Employee();
		e.setCity("Pune");
		e.setDesig("Jr.Developer");
		e.setEmpId(01012);
		e.setSalary((float) 12345.12354);
		e.setName("Atharva");
		
		e2.setCity("Hollywood");
		e2.setDesig("Director");
		e2.setEmpId(01012);
		e2.setSalary((float) 12345.12354);
		e2.setName("Wes Anderson");
		
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
		
		System.out.println();
		System.out.println("***********************************************************************************************");
		System.out.println("\n");
		
		System.out.println("This is the static method \n THE CITY IS: "+Employee.City());
		System.out.println("___________________________________________________________");
		System.out.println("This is the static variable \n THE VALUE OF PI IS: "+Employee.pi);
		
		System.out.println("___________________________________________________________");
		System.out.println("This is the non static variable accessed via getter \n THE VALUE OF CITY IS: "+e2.getCity());
		
		System.out.println("___________________________________________________________");
		System.out.println("This is the non static variable accessed via getter\n THE VALUE OF DESIGNATION IS: "+e2.getDesig());
		
		System.out.println("___________________________________________________________");
		System.out.println("This is the non static variable  accessed via getter\n THE VALUE OF EMPLOYEE ID  IS: "+e2.getEmpId());
		
		System.out.println("___________________________________________________________");
		System.out.println("This is the non static variable accessed via getter \n THE VALUE OF SALARY IS: "+e2.getSalary());
		
		System.out.println("___________________________________________________________");
		System.out.println("This is the non static variable  accessed via getter\n THE VALUE OF NAME IS: "+e.getName());
	}
}
