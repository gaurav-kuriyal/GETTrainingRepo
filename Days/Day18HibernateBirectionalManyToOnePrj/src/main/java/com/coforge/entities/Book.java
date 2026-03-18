package com.coforge.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bookid")
	private long bookId;
	private String title;
	private double cost;
	
	@ManyToOne
	@JoinColumn(name="authorid")
	private Author author;
	
	public Book(String title, double cost) {
		super();
		this.title = title;
		this.cost = cost;
	}

	public Book(String title, double cost, Author author) {
		super();
		this.title = title;
		this.cost = cost;
		this.author = author;
	}

	
	
}
