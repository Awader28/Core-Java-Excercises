package com.internship.day10.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LLdemo {

    public static void main(String[] args) {

        LinkedList<Object> l1 = new LinkedList<>();
        LinkedList<Object> l2 = new LinkedList<>();

        Student s1 = new Student("Atharva", 100, "Pune", 3);
        Student s2 = new Student("Radhe", 101, "Pune", 3);
        Student s3 = new Student("Mahajan", 102, "Pune", 3);
        Student s4 = new Student("John", 103, "Pune", 3);

        l1.addFirst(s1);
        l1.add(s2);
        l1.add(s3);
        l1.addLast(s4);

        Employee1 e1 = new Employee1("Atharva", 101, "Main Manager", 12354);
        Employee1 e2 = new Employee1("Shreyan", 102, "Co Manager", 12354);
        Employee1 e3 = new Employee1("Rakesh", 103, "Jr. Manager", 12354);
        Employee1 e4 = new Employee1("Abhiram", 104, "Sr.Manager", 12354);

        l2.addFirst(e1);
        l2.add(e2);
        l2.add(e3);
        l2.addLast(e4);

        // Using Iterator for l1
        System.out.println("Contents of l1:");
        Iterator<Object> iterator1 = l1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        // Using Iterator for l2
        System.out.println("\nContents of l2:");
        Iterator<Object> iterator2 = l2.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        
        System.out.println();
        System.out.println("REMOVED : "+l1.removeLast());
        System.out.println("REMOVED : "+l1.remove(1));
        System.out.println();
        System.out.println("Updated Contents of l1:");
        
        iterator1 = l1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        
        System.out.println();
        System.out.println("REMOVED : "+l2.removeLast());
        System.out.println("REMOVED : "+l2.remove(1));
        System.out.println();
        System.out.println("Updated Contents of l2:");
        
        iterator2 = l2.iterator();
        while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
			
		}
    }
}
