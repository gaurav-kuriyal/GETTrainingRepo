package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.beans.Book;
import com.coforge.beans.Order;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("book-bean.xml");
        Book book = (Book) context.getBean("book");
        System.out.println(book);
        
        Order ord = (Order) context.getBean("ord");
        System.out.println(ord);
    }
}
