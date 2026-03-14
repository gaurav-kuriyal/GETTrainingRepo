package com.coforge.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.coforge.entities.Employee;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class EmployeeDao implements EmployeeDaoInterface {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@PostConstruct
	public void init() {
		System.out.println("Employee Dao has been created, @PostConstruct called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Employee dao bean is being destroyed, @PreDestroy invoked");
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		String query = "SELECT * FROM emp_tab";
		RowMapper<Employee> rowMapper = (row,rowNum)->{
			Employee e = new Employee();
			e.setEmpId(row.getLong("empId"));
			e.setEname(row.getString("ename"));
			e.setSalary(row.getDouble("salary"));
			
			return e;
		};
		return jdbcTemplate.query(query, rowMapper);
	}

	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployeeById(long empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
