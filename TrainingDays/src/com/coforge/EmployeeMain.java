package com.coforge;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee("Mayank", 888,51000);
		Employee e2 = new Employee("Rajat", 878,21000);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(Employee.companyName);
		Employee.companyName = "Coforge Tech";
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(Employee.companyName);
		e1.calSalary();
		e2.calSalary();
	}

}
