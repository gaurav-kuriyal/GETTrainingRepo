package com.coforge.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="authorid")
	private long authorId;
	private String name;
	private String address;
	
	@OneToMany(mappedBy = "author", cascade= CascadeType.ALL,orphanRemoval = true)
	private List<Book> bookList = new ArrayList<Book>();
	
	
	public Author(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public void addBook(Book book) {
		this.bookList.add(book);
		book.setAuthor(this);
	}

	public void removeBook(Book book) {
		this.bookList.remove(book);
		book.setAuthor(null);
		
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
