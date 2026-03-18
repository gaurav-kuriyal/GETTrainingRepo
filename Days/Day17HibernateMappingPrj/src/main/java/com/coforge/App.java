package com.coforge;

import java.util.Scanner;

import org.hibernate.Session;

import com.coforge.dao.EmployeeDao;
import com.coforge.entities.Address;
import com.coforge.entities.Employee;
import com.coforge.util.HibernateUtil;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        EmployeeDao dao = new EmployeeDao();
        int itemChoice;
		do {
			System.out.println("\n----- MENU----");
    		System.out.println("1.) insert ");
    		System.out.println("2.) Read all");
    		System.out.println("3.) Update");
    		System.out.println("4.) Delete");
    		System.out.println("5.) Get by ID");
    		System.out.println("6.) Exit");
    		System.out.println("Enter your choice");
    		itemChoice = sc.nextInt();
    		
    		switch(itemChoice) {
    		
    		case 1: System.out.println("Enter name, email and mobile: ");
    			String ename = sc.next();
    			String email = sc.next();
    			String emobile = sc.next();
    			System.out.println("Enter city, state and pincode: ");
    			Address address = new Address(sc.next(),sc.next(),sc.next());
    		    Employee emp= new Employee(ename,email,emobile,address);
    		    System.out.println(emp);
    		    dao.insertEmployee(emp);
    		    break;
    		        
    		case 2: dao.getAllEmployees().forEach(e->System.out.println(e));
				break;
			
    		case 3: System.out.println("Enter id to update");
    			long eid = sc.nextLong();
	    		System.out.println("Enter name, email and mobile: ");
				String ename1 = sc.next();
				String email1 = sc.next();
				String emobile1 = sc.next();
				System.out.println("Enter city, state and pincode: ");
				Address address1 = new Address(sc.next(),sc.next(),sc.next());
			    Employee emp1= new Employee(eid,ename1,email1,emobile1,address1);
			    dao.updateEmployee(emp1);
	    		break;
			
    		case 4: System.out.println("Enter id to delete");
    			dao.deleteEmployee(sc.nextLong());
    			break;
    		
    		case 5: System.out.println("Enter id to find");    		
    			Employee result = dao.getById(sc.nextLong());
		    	if(result!=null) {
		    		System.out.println(result); 
		    	}
		    	else {
		    		System.out.println("Not found");
		    	}
		    	break;
		}
		}while(itemChoice!=6);
		System.out.println("Thank you for using our system");
		sc.close();

    }
}
