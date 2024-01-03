package com.internship.day10.linkedlist;

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
    public String toString() {
        return "Employee: " + empName + " (ID: " + empId + ", Role: " + role + ", Salary: Rs." + salary + ")";
    }
}