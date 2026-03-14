package com.coforge.dao;

import java.util.List;

import com.coforge.entities.Employee;

public interface EmployeeDaoInterface {
	List<Employee> getAllEmployees(); 
	void insertEmployee(Employee employee);
	Employee getEmployeeById(long empId);
	void updateEmployee(long empId,Employee employee);
	void deleteEmployee(long empId);
}
