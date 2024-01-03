package com.internship.day10.linkedlist;

import java.util.*;

class Student {
    private String name;
    private int id;
    private String department;
    private int year;

    public Student(String name, int id, String department, int year) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (ID: " + id + ", Dept: " + department + ", Year: " + year + ")";
    }
}
