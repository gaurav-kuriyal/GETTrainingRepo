package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.beans.Employee;
import com.coforge.beans.HelloBean;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
//        HelloBean hbean = new HelloBean();
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("hello-bean.xml");
//        HelloBean hbean = (HelloBean) context.getBean("hello"); //down casting
//        
//        hbean.sayHello();
//        hbean.printName();
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("emp-bean.xml");
//        Employee ebean = (Employee) context.getBean("emp");
//        System.out.println(ebean);
        
//        Employee ebean1 = (Employee) context.getBean("emp");
//        System.out.println(ebean1);
//        
//        System.out.println(ebean.hashCode());
//        System.out.println(ebean1.hashCode());
        
        ApplicationContext context = new ClassPathXmlApplicationContext("employee-bean.xml");
        Employee ebean = (Employee) context.getBean("emp");
        System.out.println(ebean);
    }
}
