package com.coforge;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.AppConfig;
import com.coforge.dao.EmployeeDao;
import com.coforge.entities.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeDao dao = context.getBean(EmployeeDao.class);
        Scanner sc = new Scanner(System.in);
//        Employee emp = new Employee(122,"mayank@mail.com",123452);
//        dao.insertEmployee(emp);
        
//        System.out.println("Getting All records");
//        dao.getAllEmployees().forEach(e->System.out.println(e));
//        System.out.println("Getting record for id 122");
//        System.out.println(dao.getEmployeeById(122));
//        Employee emp = new Employee(122,"mayank@gmail.com",123452);
//        dao.updateEmployee(122,emp);
//        System.out.println("Getting record for id 122");
//        System.out.println(dao.getEmployeeById(122));
//        dao.deleteEmployee(122);
//        System.out.println("Getting All records");
//        dao.getAllEmployees().forEach(e->System.out.println(e));
        int choice = 0;
        do {
        	try {
	        	System.out.println("------------------------------------------------------------");
	        	System.out.println("Please choose an option");
	        	System.out.println("1: Enter a new Emloyee");
	        	System.out.println("2: Get all Employees");
	        	System.out.println("3: Update an Employee");
	        	System.out.println("4: Delete an Employee");
	        	System.out.println("5: Exit");
	        	
	        	choice = sc.nextInt();
	        	
	        	switch(choice) {
	        	case 1:
	        		System.out.println("Please Enter empId, ename and salary");
	        		dao.insertEmployee(new Employee(sc.nextLong(),sc.next(),sc.nextDouble()));
	        		break;
	        	case 2:
	        		dao.getAllEmployees().forEach(e->System.out.println(e));
	        		break;
	        	case 3:
	        		System.out.println("Please Enter empId and new ename and new salary");
	        		Employee emp = new Employee(sc.nextLong(),sc.next(),sc.nextDouble());
	        		dao.updateEmployee(emp.getEmpId(), emp);
	        		break;
	        	case 4:
	        		System.out.println("Please Enter empId");
	        		dao.deleteEmployee(sc.nextLong());
	        		break;
	        	case 5:
	        		System.out.println("Thank you for using our application");
	        		break;
	        	default:
	        		System.out.println("Invalid Operation");
	        	}
        	} catch (Exception e) {
        		e.printStackTrace();
        	}
        }while(choice != 5);
        context.close();
    }
}
