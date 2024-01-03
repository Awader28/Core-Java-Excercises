package com.internship.day10.stack;

class Employee {
    private String empName;
    private int empId;

    public Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee: " + empName + " (ID: " + empId + ")";
    }
}
