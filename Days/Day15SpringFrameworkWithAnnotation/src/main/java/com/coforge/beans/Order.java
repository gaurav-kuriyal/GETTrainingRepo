package com.coforge.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Order {
//	@Value("23")
	private int ordId;
//	@Value("2")
	private int nou;
//	@Value("5855")
	private double orderCost;

//	@Autowired
	private Book book;

	public int getOrdId() {
		return ordId;
	}

	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}

	public int getNou() {
		return nou;
	}

	public void setNou(int nou) {
		this.nou = nou;
	}

	public double getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Order [ordId=" + ordId + ", nou=" + nou + ", orderCost=" + orderCost + ", book=" + book + "]";
	}

	public Order(int ordId, int nou, double orderCost, Book book) {
		super();
		this.ordId = ordId;
		this.nou = nou;
		this.orderCost = orderCost;
		this.book = book;
	}

	public Order() {
		super();
	}
	
	
}
