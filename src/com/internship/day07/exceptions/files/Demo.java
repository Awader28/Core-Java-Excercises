package com.internship.day07.exceptions.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\Aths\\sr\\athu.txt");
        FileInputStream f2 = null;

        try {
            f2 = new FileInputStream(f1);
            System.out.println("FILE FOUND");

            String string = null; // Initialize string with some value
            System.out.println(string.charAt(0)); // Accessing the first character

        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
        } catch (NullPointerException e) {
            System.out.println("String is null. Cannot access character.");
        } finally {
            if (f2 != null) {
                f2.close();
                System.out.println("FILE CLOSED");
            }
        }
    }
}
