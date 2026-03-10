package com.coforge.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	private int eid;
	private String ename;
	private long salary;
	private String email;
	private String mobile;
	private LocalDate doj;
	private LocalDate dob;
	
	public Employee(String ename, long salary, String email, String mobile, LocalDate doj, LocalDate dob) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.email = email;
		this.mobile = mobile;
		this.doj = doj;
		this.dob = dob;
	}
	
	
}
