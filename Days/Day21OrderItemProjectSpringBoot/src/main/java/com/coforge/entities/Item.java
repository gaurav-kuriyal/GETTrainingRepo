package com.coforge.entities;

import java.util.HashSet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="items")
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long itemid;
	private String itemName;
	private double itemPrice;
	
	@ManyToMany(mappedBy = "items")
	private HashSet<Order> orders;

	public Item(String itemName, double itemPrice) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	public Item(String itemName, double itemPrice, HashSet<Order> orders) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.orders = orders;
	}
	
	
}
