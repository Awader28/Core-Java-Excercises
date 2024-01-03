package com.internship.day10.stack;
import java.util.*;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (ID: " + id + ")";
    }
}