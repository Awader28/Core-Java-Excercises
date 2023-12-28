package com.internship.day07.exception.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
public static void main(String[] args) {
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/avion?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false";
	String user="root";
	String pass="atharva28";
	
	try {
	  Class.forName(driver);
	  Connection Con=DriverManager.getConnection(url,user,pass);
	  System.out.println("CONNECTION SUCCESSFUL");
	} catch (ClassNotFoundException e1) {
	    // Handle ExceptionType1
	    // ...
		System.out.println("DATABASE DRIVER NOT FOUND");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("SQL RELATED EXCEPTIONN CHECK USERID, PASSWORD AND URL");
	}
}
	







}