package com.coforge.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String uname="root";
	private static final String password = "Cfg@1234";
	private static final String url="jdbc:mysql://localhost:3306/coforge_db";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,password);
		return con;
	}
}
