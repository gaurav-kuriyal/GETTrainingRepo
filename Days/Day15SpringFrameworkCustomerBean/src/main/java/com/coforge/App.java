package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.beans.Customer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("cust-bean.xml");
//        Customer cust = (Customer) context.getBean("cust");
//        System.out.println(cust);
//        
//        ApplicationContext context2 = new ClassPathXmlApplicationContext("customer-bean.xml");
//        Customer cust2 = (Customer) context2.getBean("cust");
//        System.out.println(cust2);
//
//        ApplicationContext context3 = new ClassPathXmlApplicationContext("customer-bean-type.xml");
//        Customer cust3 = (Customer) context3.getBean("cust");
//        System.out.println(cust3);

        ApplicationContext context4 = new ClassPathXmlApplicationContext("customer-bean-constructor.xml");
        Customer cust4 = (Customer) context4.getBean("cust");
        System.out.println(cust4);
        
    }
}
