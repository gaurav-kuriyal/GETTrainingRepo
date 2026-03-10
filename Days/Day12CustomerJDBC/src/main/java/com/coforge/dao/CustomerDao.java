package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.coforge.entities.Customer;
import com.coforge.utils.DBUtil;

public class CustomerDao {
	public static List<Customer> getAllCustomers() {
		List<Customer> custList = new ArrayList<Customer>();
		
		try {
			Connection con = DBUtil.getConnection();
			
			String query="select * from customers";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				Customer customer = new Customer();
				customer.setCusId(rs.getLong("custId"));
				customer.setCustName(rs.getString("custName"));
				customer.setAddress(rs.getString("address"));
				customer.setEmail(rs.getString("email"));
				customer.setMobile(rs.getString("mobile"));
				
				custList.add(customer);
			}
			
			
			return custList;
		
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e);
			e.printStackTrace();
			
			return null;
		}
	}
	
	public static Customer addCustomer(Customer customer) {
		try {
			Connection con = DBUtil.getConnection();
			String query="insert into customers (custId,custName,address,email,mobile) values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setLong(1, customer.getCusId());
			ps.setString(2, customer.getCustName());
			ps.setString(3, customer.getAddress());
			ps.setString(4, customer.getEmail());
			ps.setString(5, customer.getMobile());
			
			ps.executeUpdate();
			return customer;

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static Customer getCustomerById(long custId) {
		try {
			Connection con = DBUtil.getConnection();
			String query="select * from customers where custId = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setLong(1, custId);
			ResultSet rs = ps.executeQuery();
			Customer customer = new Customer();
			if(rs== null) {
				return null;
			}
			while(rs.next()) {
				customer.setCusId(rs.getLong("custId"));
				customer.setCustName(rs.getString("custName"));
				customer.setAddress(rs.getString("address"));
				customer.setEmail(rs.getString("email"));
				customer.setMobile(rs.getString("mobile"));
			}
			return customer;
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
