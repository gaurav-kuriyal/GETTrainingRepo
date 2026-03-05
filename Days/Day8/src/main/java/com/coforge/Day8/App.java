package com.coforge.Day8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
	public static Connection con;
	static {
		String uname="root";
        String password = "Cfg@1234";
        String url = "jdbc:mysql://localhost:3306/coforge_db";
        
        try {
			con = DriverManager.getConnection(url,uname,password);
			System.out.println("Connection Established");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
    public static void main(String[] args) throws SQLException {
        String query= "{call get_all_students()}";
        CallableStatement cs = con.prepareCall(query);
        
        ResultSet rs = cs.executeQuery(query);
        while(rs.next()) {
        	System.out.println("Student ID: "+rs.getInt("stdId"));
        	System.out.println("Student Name: "+rs.getString("studentName"));
        	System.out.println("Student Marks: "+rs.getDouble(3));
        	System.out.println("Student Mobile Number: "+rs.getString(4));
        	System.out.println("Student DOB: "+rs.getString("DOB"));
        	
        	System.out.println("---------------------------------------");
        }
        
    }
}
