package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.beans.Book;
import com.coforge.beans.Order;
import com.coforge.beans.Student;
import com.coforge.configuration.BookOrderConfig;
import com.coforge.configuration.StudentConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("book-bean.xml");
//        Book book = (Book) context.getBean("book");
//        System.out.println(book);
//        
//        Order ord = (Order) context.getBean("ord");
//        System.out.println(ord);
    	
//      ApplicationContext context = new AnnotationConfigApplicationContext(BookOrderConfig.class);
//      Book book = (Book) context.getBean("book");
//      System.out.println(book);
//      
//      Order ord = (Order) context.getBean("ord");
//      System.out.println(ord);
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student stud = (Student) context.getBean("std");
        System.out.println(stud);
        
        Student stud1 = (Student) context.getBean("std");
        System.out.println(stud1);
        
        System.out.println(stud.hashCode());
        System.out.println(stud1.hashCode());
    }
}
