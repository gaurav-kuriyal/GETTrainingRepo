package com.coforge.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemId;
	private String itemName;
	private double itemPrice;
	private int quantity;
	public Item(String itemName, double itemPrice, int quantity) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	}
	
	
}
