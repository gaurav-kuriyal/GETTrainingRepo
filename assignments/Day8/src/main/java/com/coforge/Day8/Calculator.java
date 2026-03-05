package com.coforge.Day8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Select from following options");
			System.out.println("1: Add");
			System.out.println("2: Subtract");
			System.out.println("3: Multiply");
			System.out.println("4: Divide");
			System.out.println("5: Exit");
			
			choice = sc.nextInt();
			try {
				switch(choice) {
				case 1:
					System.out.println("Enter two numbers:");
					Calculator.add(sc.nextInt(), sc.nextInt());
					break;
				case 2:
					System.out.println("Enter two numbers:");
					Calculator.subtract(sc.nextInt(), sc.nextInt());
					break;
				case 3:
					System.out.println("Enter two numbers:");
					Calculator.product(sc.nextInt(),sc.nextInt());
					break;
				case 4:
					System.out.println("Enter two numbers:");
					Calculator.division(sc.nextInt(),sc.nextInt());
					break;
				case 5:
					System.out.println("Thank you for using our calculator");
					break;
				default:
					System.out.println("Please select valid options");
				}
			}
			catch(Exception err) {
				System.out.println(err);
			}
		}while(choice!=5);
	}
	
	public static void add(int a, int b) throws SQLException {
		String query= "{call add_numbers(?,?,?)}";
        CallableStatement cs = con.prepareCall(query);
        cs.setInt(1, a);
        cs.setInt(2, b);
        cs.registerOutParameter(3, Types.INTEGER);
        cs.execute();
        
        int sum = cs.getInt(3);
        System.out.println("Addition of two numbers: "+sum);
	}
	
	public static void subtract(int a, int b) throws SQLException {
		String query= "{call subtract_numbers(?,?,?)}";
        CallableStatement cs = con.prepareCall(query);
        cs.setInt(1, a);
        cs.setInt(2, b);
        cs.registerOutParameter(3, Types.INTEGER);
        cs.execute();
        
        int difference = cs.getInt(3);
        System.out.println("Subtraction of two numbers: "+difference);
	}
	
	public static void product(int a, int b) throws SQLException {
		String query= "{call multiply_numbers(?,?,?)}";
        CallableStatement cs = con.prepareCall(query);
        cs.setInt(1, a);
        cs.setInt(2, b);
        cs.registerOutParameter(3, Types.INTEGER);
        cs.execute();
        
        int product = cs.getInt(3);
        System.out.println("Product of two numbers: "+product);
	}
	
	
	public static void division(int a, int b) throws SQLException {
		String query= "{call divide_numbers(?,?,?)}";
		CallableStatement cs = con.prepareCall(query);
		cs.setInt(1, a);
		cs.setInt(2, b);
		cs.registerOutParameter(3, Types.DOUBLE);
		cs.execute();
		
		double division = cs.getDouble(3);
		System.out.println("Division of two numbers: "+division);
	}
	
}
