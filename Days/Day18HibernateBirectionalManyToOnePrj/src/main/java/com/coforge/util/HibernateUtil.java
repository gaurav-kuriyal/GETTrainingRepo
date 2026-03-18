package com.coforge.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.coforge.entities.Author;
import com.coforge.entities.Book;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory(); 
			
	public static SessionFactory buildSessionFactory() {
		try {
			Properties properties = new Properties();
			InputStream inputStream = HibernateUtil.class.getClassLoader().getResourceAsStream("application.properties");
			properties.load(inputStream);
			Configuration configuration = new Configuration();
			configuration.setProperties(properties);
			configuration.addAnnotatedClass(Book.class);
			configuration.addAnnotatedClass(Author.class);
			
			return configuration.buildSessionFactory();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
