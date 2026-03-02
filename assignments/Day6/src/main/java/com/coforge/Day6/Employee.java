package com.coforge.Day6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Employee {
	private final long empId;
	private String empName;
	private double salary;
}
