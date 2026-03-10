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
		String query = "update employees set ename=?, salary=?, email=?, mobile=?, doj=?, dob=? where eid = ?";
		try(Connection con=DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(query);){
			
			ps.setString(1, employee.getEname());
			ps.setLong(2, employee.getSalary());
			ps.setString(3, employee.getEmail());
			ps.setString(4, employee.getMobile());
			ps.setDate(5, java.sql.Date.valueOf(employee.getDoj()));
			ps.setDate(6, java.sql.Date.valueOf(employee.getDob()));
			ps.setInt(7, employee.getEid());
			
			ps.executeUpdate();
			
			return employee;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static Employee getEmployeeById(int eid) {
		String query = "Select * from employees where eid= ?";
		try(Connection con=DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(query);){
			ps.setInt(1, eid);
			Employee employee = new Employee();
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setSalary(rs.getLong("salary"));
				employee.setEmail(rs.getString("email"));
				employee.setMobile(rs.getString("mobile"));
				employee.setDoj(rs.getDate("doj").toLocalDate());
				employee.setDob(rs.getDate("dob").toLocalDate());
			}
			return employee;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static void deleteEmployeeById(int eid) {
		String query = "delete from employees where eid= ?";
		try(Connection con=DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(query);){
			ps.setInt(1, eid);
			ps.execute();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<Employee> getEmployeeByQuery(String search) {
		String query = "Select * from employees where ename like ? or email like ? or mobile like ? or doj like ? or dob like ?";
		try(Connection con=DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(query);){
			search = '%' + search + '%';
			ps.setString(1, search);
			ps.setString(2, search);
			ps.setString(3, search);
			ps.setString(4, search);
			ps.setString(5, search);
			ResultSet rs = ps.executeQuery();
			
			ArrayList<Employee> empList = new ArrayList<Employee>();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setSalary(rs.getLong("salary"));
				employee.setEmail(rs.getString("email"));
				employee.setMobile(rs.getString("mobile"));
				employee.setDoj(rs.getDate("doj").toLocalDate());
				employee.setDob(rs.getDate("dob").toLocalDate());
				
				empList.add(employee);
			}
			return empList;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
