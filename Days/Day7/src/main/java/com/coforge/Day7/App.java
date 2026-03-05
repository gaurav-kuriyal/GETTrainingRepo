package com.coforge.Day7;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Hello World!");
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        
        String uname="root";
        String password = "Cfg@1234";
        String url = "jdbc:mysql://localhost:3306/coforge_db";
        
        Connection con = DriverManager.getConnection(url,uname,password);
		
        System.out.println("Connection Established");
        
        Statement st = con.createStatement();
        String query = "Select * from student";
        ResultSet rs = st.executeQuery(query);
        System.out.println("Student Data\n---------------------------------------");
        while(rs.next()) {
        	System.out.println("Student ID: "+rs.getInt("stdId"));
        	System.out.println("Student Name: "+rs.getString("studentName"));
        	System.out.println("Student Marks: "+rs.getDouble(3));
        	System.out.println("Student Mobile Number: "+rs.getString(4));
        	System.out.println("Student DOB: "+rs.getString("DOB"));
        	
        	System.out.println("---------------------------------------");
        }
//        ResultSetMetaData rsmd = rs.getMetaData();
//        int count = rsmd.getColumnCount();
//        for(int i=1;i<=count;i++) {
//        	System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnLabel(i)+" "+rsmd.getColumnType(i)+" "+rsmd.getColumnTypeName(i));
//        	
//        	System.out.println("---------------------------------------");
//        }
        
//        Insertion
//        String query = "insert into student values (?,?,?,?,?)";
//        PreparedStatement ps = con.prepareStatement(query);
//        ps.setInt(1, 4392);
//        ps.setString(2, "Rajjo");
//        ps.setDouble(3,100);
//        ps.setString(4,"7373878478");
////        ps.setDate(5, new Date(2026,1,12));
//        ps.setDate(5, Date.valueOf("2003-05-24"));
////        LocalDate ldate = LocalDate.now();
////        ps.setDate(5, Date.valueOf(ldate));
//        ps.executeUpdate();
//        System.out.println("row inserted");
        
//        Update
//        String query = "update student set marks= ? where stdId=?";
//        PreparedStatement ps = con.prepareStatement(query);
//        ps.setDouble(1,97);
//        ps.setInt(2, 4392);
//        ps.executeUpdate();
//        System.out.println("row updated");
        
//        	Delete
//	      String query2 = "delete from student where stdId=?";
//	      PreparedStatement ps = con.prepareStatement(query2);
//	      ps.setInt(1,777);
//	      ps.executeUpdate();
//	      System.out.println("row deleted");
    }
}
