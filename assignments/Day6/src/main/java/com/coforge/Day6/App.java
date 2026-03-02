package com.coforge.Day6;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
	static HashSet<Employee> empSet = new HashSet<Employee>();
	
	static {
		empSet.add(new Employee(111,"Gaurav",50000));
		empSet.add(new Employee(222,"Mayank",60000));
		empSet.add(new Employee(333,"Rajat",70000));
		empSet.add(new Employee(444,"Swati",30000));
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int choice;
        
        do {
        	System.out.println("------------------------------------------------------------");
        	System.out.println("Please select an option:");
        	System.out.println("1. Get all employees");
        	System.out.println("2. Get a single employee");
        	System.out.println("3. Insert an employee");
        	System.out.println("4. Update an employee");
        	System.out.println("5. Delete an employee");
        	System.out.println("6. Exit");
        	
        	choice = sc.nextInt();
        	
        	switch(choice) {
	        	case 1:
	        		EmployeeCRUD.read();
	        		break;
	        	case 2:
	        		System.out.println("Enter Employee ID: ");
	        		EmployeeCRUD.read(sc.nextInt());
	        		break;
	        	case 3:
	        		System.out.println("Enter Employee ID, Employee Name and Salary of the Employee");
	        		EmployeeCRUD.create(sc.nextInt(), sc.next(), sc.nextDouble());
	        		break;
	        	case 4:
	        		System.out.println("Enter Employee ID, Employee Name and Salary of the Employee");
	        		EmployeeCRUD.update(sc.nextInt(), sc.next(), sc.nextDouble());
	        		break;
	        	case 5:
	        		System.out.println("Enter Employee ID: ");
	        		EmployeeCRUD.delete(sc.nextInt());
	        		break;
	        	default:
	        		System.out.println("Invalid Choice");
        	}
        	
        }while(choice != 6);
        
        System.out.println("Thank you for using our services");
        sc.close();
    }
}
