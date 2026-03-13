package com.coforge.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class Book {
	
//	@Value("${Book.id}")
	private long bookId;
//	@Value("${Book.title}")
	private String title;
//	@Value("${Book.price}")
	private double price;
//	@Value("#{'${Book.authors}'.split(',')}")
	private List<String> authors;
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + ", authors=" + authors + "]";
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	
	
	public Book(long bookId, String title, double price, List<String> authors) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.authors = authors;
	}
	public Book() {
		super();
	}
	
	
}
