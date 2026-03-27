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
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cartId;
	private long customerId;
	private long itemId;
	private int quantity;
	
	public Cart(long customerId, long itemId, int quantity) {
		super();
		this.customerId = customerId;
		this.itemId = itemId;
		this.quantity = quantity;
	}
	
	

}
