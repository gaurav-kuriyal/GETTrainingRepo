package com.coforge;

import java.time.LocalDate;
import java.util.List;

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
        OrderDao dao = new OrderDao();
        dao.insertOrder(new Order(21,"Gaurav",LocalDate.now()));
        dao.getAllOrders().forEach(o->System.out.println(o));
        
//        System.out.println(dao.getById(2));
    }
}
