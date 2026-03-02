package com.coforge.Day6;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static HashSet<Employee> empSet = new HashSet<Employee>();
	
	static {
		empSet.add(new Employee(111,"Gaurav",50000));
		empSet.add(new Employee(222,"Mayank",60000));
		empSet.add(new Employee(333,"Rajat",70000));
		empSet.add(new Employee(444,"Swati",30000));
	}
	
	public static void main(String[] args) {
		// Read Operation
		empSet.forEach(e->System.out.println(e));
		
		// Create or insert
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee detais empId, empName,salary: ");
		Employee newEmp = new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
		empSet.add(newEmp);
		
		//update
		System.out.println("Enter employee id for modification: ");
		long id = sc.nextLong();
//		if(empSet.contains())
//		Employee upEmp = empSet
		
		//delete
		
		
		//get single employee
		
		sc.close();
		
	}

}
