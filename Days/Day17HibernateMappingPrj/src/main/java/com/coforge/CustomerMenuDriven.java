package com.coforge;

import java.util.Scanner;

import com.coforge.dao.CustomerDao;
import com.coforge.dao.EmployeeDao;
import com.coforge.entities.Address;
import com.coforge.entities.Customer;
import com.coforge.entities.Employee;
import com.coforge.entities.Order;

public class CustomerMenuDriven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        CustomerDao dao = new CustomerDao();
        int itemChoice;
		do {
			System.out.println("\n----- MENU----");
    		System.out.println("1.) insert ");
    		System.out.println("2.) Read all");
    		System.out.println("3.) Update");
    		System.out.println("4.) Delete");
    		System.out.println("5.) Get by ID");
//    		System.out.println("6.) Enter Order to the Customer");
    		System.out.println("6.) Exit");
    		System.out.println("Enter your choice");
    		itemChoice = sc.nextInt();
    		
    		switch(itemChoice) {
    		
    		case 1: System.out.println("Enter name and city: ");
    		    dao.insertCustomer(new Customer(sc.next(), sc.next()));
    		    break;
    		        
    		case 2: dao.getAllCustomers().forEach(c->System.out.println(c));
				break;
			
    		case 3: System.out.println("Enter id to update: ");
    			Customer result = dao.getById(sc.nextLong());
		    	if(result!=null) {
		    		System.out.println("Enter name and city: ");
		    		result.setCustName(sc.next());
		    		result.setCity(sc.next());
		    		dao.updateCustomer(result);
		    	}
		    	else {
		    		System.out.println("Not found");
		    	}
	    		break;
			
    		case 4: System.out.println("Enter id to delete");
    			dao.deleteCustomer(sc.nextLong());
    			break;
    		
    		case 5: System.out.println("Enter id to find");    		
    			Customer result2 = dao.getById(sc.nextLong());
		    	if(result2!=null) {
		    		System.out.println(result2);
		    		System.out.println("Orders:");
		    		System.out.println(result2.getOrders());
		    	}
		    	else {
		    		System.out.println("Not found");
		    	}
		    	break;

//    		case 6: System.out.println("Enter id to update: ");
//				Customer result3 = dao.getById(sc.nextLong());
//				if(result3!=null) {
//					System.out.println("Enter product name and amount: ");
//					Order new_ord = new Order(sc.next(),sc.nextDouble());
//					System.out.println("Order created");
//					System.out.println("Previous list "+result3.getOrders());
//					result3.getOrders().add(new_ord);
//					System.out.println("After list "+result3.getOrders());
//					dao.updateCustomer(result3);
//				}
//				else {
//					System.out.println("Not found");
//				}
//				break;
		}
		}while(itemChoice!=6);
		System.out.println("Thank you for using our system");
		sc.close();

	}

}
