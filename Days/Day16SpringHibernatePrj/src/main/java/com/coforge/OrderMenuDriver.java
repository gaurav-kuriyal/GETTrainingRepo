package com.coforge;

import java.time.LocalDate;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.dao.ItemDao;
import com.coforge.dao.OrderDao;
import com.coforge.entities.Item;
import com.coforge.entities.Order;

/**
 * Hello world!
 */
public class OrderMenuDriver {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	OrderDao orderdao = new OrderDao();
    	

    			int orderChoice;
    			do {
    				
    				
    				System.out.println("\n-----Order MENU----");
    	    		System.out.println("1.)  insert ");
    	    		System.out.println("2.) Read all");
    	    		System.out.println("3.) Update an order");
    	    		System.out.println("4.) Delete an Order");
    	    		System.out.println("5.) Get Order by Id");
    	    		System.out.println("6.) Exit");
    	    		System.out.println("Enter your choice");
    	    		orderChoice = sc.nextInt();
    	    		
    	    		switch(orderChoice) {
    	    		
    	    		
    	    		case 1: 
    	    			System.out.println("Enter Customer  name");
    		        String custname = sc.next();
    		        
    		        System.out.println("Enter order date ");
    		        String date = sc.next();
    		        
    		        
    		        Order order = new Order(custname, LocalDate.parse(date));
    		        orderdao.insertOrder(order);
    		        
    		        break;
    	    		case 2:  List<Order> orders = orderdao.getAllOrders();
    	    		for(Order o : orders) {
    	    			System.out.println(o.getOrdId() +" " +o.getCustName() + " " + o.getOrdDate());
    	    		}
    				break;
    		        
    		        
    	    		case 3: 
    	    			System.out.println("Enter id to update");
        	    		
        	    		int newId = sc.nextInt();
        	    		sc.nextLine();
        	    		System.out.println("ENter new name");
        	    		String newName = sc.nextLine();
        	    		
        	    		System.out.println("Enter new Date");
        	    		String newDate = sc.nextLine();
        	    		
        	    		Order upOrder = new Order(newName, LocalDate.parse(newDate));
        	    		upOrder.setOrdId(newId);
        	    		orderdao.updateOrder(upOrder);
        	    		
        	    		break;
    	    			
    	    		case 4: System.out.println("Enter id to delete");
    	    		int todeleteId= sc.nextInt();
    	    		
    	    		orderdao.deleteOrder(todeleteId);
    	    		break;
    	    		
    	    		case 5: System.out.println("Enter id to get");
    	    		int togetId= sc.nextInt();
    	    		
    	    		orderdao.getById(togetId);
    	    		break;
    	    		}
    			}while(orderChoice!=6);
    		
    	sc.close();
    }
}
