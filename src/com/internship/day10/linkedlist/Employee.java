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
	public int hashCode() {
		return Objects.hash(department, id, name, year);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(department, other.department) && id == other.id && Objects.equals(name, other.name)
				&& year == other.year;
	}



	@Override
    public String toString() {
        return "Student: " + name + " (ID: " + id + ", Dept: " + department + ", Year: " + year + ")";
    }
}
