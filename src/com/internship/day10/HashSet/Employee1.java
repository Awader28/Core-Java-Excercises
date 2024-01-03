package com.internship.day10.HashSet;

import java.util.Objects;

class Employee1{
    private String empName;
    private int empId;
    private String role;
    private double salary;

    public Employee1(String empName, int empId, String role, double salary) {
        this.empName = empName;
        this.empId = empId;
        this.role = role;
        this.salary = salary;
    }
    
    

    @Override
	public int hashCode() {
		return Objects.hash(empId, empName, role, salary);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return empId == other.empId && Objects.equals(empName, other.empName) && Objects.equals(role, other.role)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}



	@Override
    public String toString() {
        return "Employee: " + empName + " (ID: " + empId + ", Role: " + role + ", Salary: Rs." + salary + ")";
    }
}