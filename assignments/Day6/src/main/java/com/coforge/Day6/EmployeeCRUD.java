package com.coforge.Day6;

public class EmployeeCRUD {
	public static void create(Integer empId, String empName, double salary) {
		for(Employee emp : App.empSet)
			if(emp.getEmpId() == empId) {
				System.out.println("Employee already exists for the empId "+empId);
				return;
			}
		
		Employee e = new Employee(empId, empName, salary);
		App.empSet.add(e);
		System.out.println("Employee Created Successfully");
	}
	
	public static void read() {
		for(Employee e : App.empSet)
			System.out.println(e);		
	}
	
	public static void read(Integer empId) {
		for(Employee e : App.empSet)
			if(e.getEmpId() == empId) {
				System.out.println(e);
				return;
			}
		
		System.out.println("Employee not found");
	}
	
	public static void update(Integer empId,String empName,double salary) {
		for(Employee e : App.empSet)
			if(e.getEmpId() == empId) {
				e.setEmpName(empName);
				e.setSalary(salary);
				System.out.println("Employee updated successfully");
				return;
			}
		
		System.out.println("Employee not found");
	}
	
	public static void delete(Integer empId) {
		for(Employee e : App.empSet)
			if(e.getEmpId() == empId) {
				App.empSet.remove(e);
				System.out.println("Employee deleted successfully");
				return;
			}
		
		System.out.println("Employee not found");
	}
	
}
