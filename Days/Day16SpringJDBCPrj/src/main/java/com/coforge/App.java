package com.coforge;

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
        dao.getAllEmployees().forEach(e->System.out.println(e));
        context.close();
    }
}
