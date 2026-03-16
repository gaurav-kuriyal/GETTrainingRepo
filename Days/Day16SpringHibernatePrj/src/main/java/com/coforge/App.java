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
public class App {
    public static void main(String[] args) {
//        ItemDao dao = new ItemDao();
//        dao.getAllItems().forEach(i->System.out.println(i));
//        dao.insertItem(new Item(5,"Mouse",600));
//        dao.getAllItems().forEach(i->System.out.println(i));
//        OrderDao dao = new OrderDao();
//        dao.insertOrder(new Order("Gaurav",LocalDate.now()));
//        dao.getAllOrders().forEach(o->System.out.println(o));
        
//        System.out.println(dao.getById(2));
    	Scanner sc = new Scanner(System.in);
    	
    	ItemDao itemdao = new ItemDao();
    	
    	int itemChoice;
    			do {
    				System.out.println("\n-----ITEM MENU----");
    	    		System.out.println("1.)  insert ");
    	    		System.out.println("2.) Read all");
    	    		System.out.println("3.) Update an Item");
    	    		System.out.println("4.) Delete an Item");
    	    		System.out.println("5.) Get Item by ID");
    	    		System.out.println("6.) Exit");
    	    		System.out.println("Enter your choice");
    	    		itemChoice = sc.nextInt();
    	    		
    	    		switch(itemChoice) {
    	    		
    	    		case 1: System.out.println("Enter item id : ");
    	    		        long itemid =  sc.nextLong();
    	    		       sc.nextLine();
    	    		        System.out.println("Enter Item  name");
    	    		        String itmname = sc.nextLine();
    	    		        sc.nextLine();
    	    		        System.out.println("Enter price ");
    	    		        double price= sc.nextDouble();
    	    		        
    	    		        
    	    		        Item item = new Item(itemid, itmname, price);
    	    		        itemdao.insertItem(item);
    	    		        
    	    		        break;
    	    		        
    	    		case 2: List<Item> items = itemdao.getAllItems();
    	    		for(Item i : items) {
    	    			System.out.println(i.getId() +" " +i.getName() + " " + i.getCost());
    	    		}
    				break;
    				
    	    		case 3: System.out.println("Enter id to update");
    	    		
    	    		long newId = sc.nextLong();
    	    		sc.nextLine();
    	    		System.out.println("ENter new name");
    	    		String newName = sc.nextLine();
    	    		
    	    		System.out.println("Enter new Price");
    	    		double newPrice = sc.nextDouble();
    	    		
    	    		Item itm = new Item(newId, newName, newPrice);
    	    		itemdao.updateItem(itm);
    	    		break;
    				
    	    		case 4: System.out.println("Enter id to delete");
    	    		long todeleteId= sc.nextLong();
    	    		
    	    		itemdao.deleteItem(todeleteId);
    	    		break;
    	    		
    	    		
    	    		case 5: System.out.println("Enter id to find item");
    	    		
    	    		long Rid = sc.nextLong();
    	    		
    	    	 Item result = itemdao.getById(Rid);
    	    	 if(result!=null) {
    	    		 System.out.println(result.getId() + " " +result.getName() + " "+result.getCost());
    	    		 
    	    	 }
    	    	 else {
    	    		 System.out.println("No item found");
    	    	 }
    	    		
    	    		break;
    			}
    			}while(itemChoice!=6);
    			
    	sc.close();
    }
}
