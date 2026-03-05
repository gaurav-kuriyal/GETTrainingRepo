package com.coforge.Day8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class Calculator {
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
		String query= "{call add_numbers(?,?,?)}";
        CallableStatement cs = con.prepareCall(query);
        cs.setInt(1, 22);
        cs.setInt(2, 32);
        cs.registerOutParameter(3, Types.INTEGER);
//        ResultSet rs = cs.executeQuery(query);
        cs.execute();
        
        int sum = cs.getInt(3);
        System.out.println("Addition of two numbers: "+sum);
	}
}
