package com.coforge.Day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenuDrivenCRUD {
	public static Connection con;
	static {
		String uname="root";
        String password = "Cfg@1234";
        String url = "jdbc:mysql://localhost:3306/fruits_db";
        
        try {
			con = DriverManager.getConnection(url,uname,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Select from following options");
			System.out.println("1: Enter a new Fruit Details");
			System.out.println("2: Update a Fruit Details");
			System.out.println("3: Get a Fruit Details");
			System.out.println("4: Delete a Fruit Details");
			System.out.println("5: Exit");
			
			choice = sc.nextInt();
			try {
				switch(choice) {
				case 1:
					System.out.println("Enter the ID, Name of the fruit and Price:");
					MenuDrivenCRUD.create(sc.nextInt(), sc.next(), sc.nextDouble());
					break;
				case 2:
					System.out.println("Enter the ID of the fruit to be updated followed with new name of the fruit and Price:");
					MenuDrivenCRUD.update(sc.nextInt(), sc.next(), sc.nextDouble());
					break;
				case 3:
					System.out.println("Enter the ID of the fruit:");
					MenuDrivenCRUD.read(sc.nextInt());
					break;
				case 4:
					System.out.println("Enter the ID of the fruit:");
					MenuDrivenCRUD.delete(sc.nextInt());
					break;
				case 5:
					System.out.println("Thank you for using our application");
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
	
	public static void create(int id,String fruitName,double price) {
		try {
			String query = "insert into fruits values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
		    ps.setString(2, fruitName);
			ps.setDouble(3,price);	
		    ps.executeUpdate();
		    
	    	System.out.println("row inserted");
	    
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void update(int id,String fruitName,double price) {
		try {
			String query = "update fruits set fruitName=?, price = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(query);
		    ps.setString(1, fruitName);
			ps.setDouble(2,price);	
			ps.setInt(3, id);
		    ps.executeUpdate();
		    
		    System.out.println("row updated");
	    
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(int id) {
		try {
			String query = "delete from fruits where id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
		    ps.executeUpdate();
		    
		    System.out.println("row deleted");
	    
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void read(int id) {
		try {
//			System.out.println(id);
			Statement st = con.createStatement();
	        String query = "Select * from fruits where id = "+id;
	        ResultSet rs = st.executeQuery(query);
	        System.out.println("Fruits Data\n---------------------------------------");
	        while(rs.next()) {
	        	System.out.println("ID: "+rs.getInt("id"));
	        	System.out.println("Fruit Name: "+rs.getString("fruitName"));
	        	System.out.println("Price: "+rs.getDouble("price"));
	        	
	        	System.out.println("---------------------------------------");
	        }
	    
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
