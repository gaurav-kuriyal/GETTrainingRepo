package com.coforge.configuration;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.beans.Book;
import com.coforge.beans.Order;

@Configuration
public class BookOrderConfig {
	
	@Bean(name="ord")
	public Order getOrderBean() {
		return new Order(313,5,45678,getBookBean());
	}
	
	@Bean(name="book")
	public Book getBookBean() {
		String authArr[] = {"Gaurav","Mayank","Rajjo"};
		ArrayList<String> authorList = new ArrayList<String>(Arrays.asList(authArr));
		return new Book(123,"PythonTutorials",600,Arrays.asList(authArr));
	}
}
