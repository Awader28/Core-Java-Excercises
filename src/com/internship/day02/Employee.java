package com.internship.day02;

class Employee {
    int id;
    String name;
    float salary;

    void setData(int empId, String empName, float empSalary) {
        id = empId;
        name = empName;
        salary = empSalary;
    }

    void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}