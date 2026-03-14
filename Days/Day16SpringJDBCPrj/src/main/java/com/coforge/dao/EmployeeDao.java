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
		String query = "INSERT INTO emp_tab (empId,ename,salary) VALUES (?,?,?)";
		jdbcTemplate.update(query,employee.getEmpId(),employee.getEname(),employee.getSalary());
		System.out.println("Row Inserted");
	}

	@Override
	public Employee getEmployeeById(long empId) {
		String query = "SELECT * FROM emp_tab WHERE empId = ?";
		RowMapper<Employee> rowMapper = (rs,rowNum)->{
			Employee e = new Employee();
			e.setEmpId(rs.getLong("empId"));
			e.setEname(rs.getString("ename"));
			e.setSalary(rs.getDouble("salary"));
			
			return e;
		};
		return jdbcTemplate.queryForObject(query, rowMapper,empId);
	}

	@Override
	public void updateEmployee(long empId, Employee employee) {
		String query = "UPDATE emp_tab SET ename =?,salary =? WHERE empId=?";
		jdbcTemplate.update(query,employee.getEname(),employee.getSalary(),employee.getEmpId());
		System.out.println("Row Updated");
	}

	@Override
	public void deleteEmployee(long empId) {
		String query = "DELETE from emp_tab WHERE empId=?";
		jdbcTemplate.update(query,empId);
		System.out.println("Row Deleted");
	}

}
