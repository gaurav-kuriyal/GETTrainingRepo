package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.coforge.models.Employee;
import com.coforge.util.DBUtil;

public class EmployeeDAO {
	public static List<Employee> getAllEmployees(){
		
		String query = "select * from employees";
		try(Connection con=DBUtil.getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query)){
			
			List<Employee> empList = new ArrayList<Employee>();
			
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEid(rs.getInt("eid"));
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getLong("salary"));
				emp.setEmail(rs.getString("email"));
				emp.setMobile(rs.getString("mobile"));
				emp.setDob(rs.getDate("dob").toLocalDate());
				emp.setDoj(rs.getDate("doj").toLocalDate());
				
				empList.add(emp);
			}
			
			return empList;
		} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static Employee addEmployee(Employee employee) {
		String query = "insert into employees (ename,salary,email,mobile,doj,dob) values (?,?,?,?,?,?)";
		try(Connection con=DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(query);){
			
			ps.setString(1, employee.getEname());
			ps.setLong(2, employee.getSalary());
			ps.setString(3, employee.getEmail());
			ps.setString(4, employee.getMobile());
			ps.setDate(5, java.sql.Date.valueOf(employee.getDoj()));
			ps.setDate(6, java.sql.Date.valueOf(employee.getDob()));
			
			ps.executeUpdate();
			
			return employee;
			
		} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static Employee updateEmployee(Employee employee) {
		String query = "insert into employees (ename,salary,email,mobile,doj,dob) values (?,?,?,?,?,?)";
		try(Connection con=DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(query);){
			
			ps.setString(1, employee.getEname());
			ps.setLong(2, employee.getSalary());
			ps.setString(3, employee.getEmail());
			ps.setString(4, employee.getMobile());
			ps.setDate(5, java.sql.Date.valueOf(employee.getDoj()));
			ps.setDate(6, java.sql.Date.valueOf(employee.getDob()));
			
			ps.executeUpdate();
			
			return employee;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static Employee getEmployeeById(int eid) {
		
		return null;
	}
}
