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
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	private long cartId;
	private long customerId;
	private double toatalAmount;
	private String paymentStatus;
	private String orderStatus;
	
	public Order(long cartId, long customerId, double toatalAmount, String paymentStatus, String orderStatus) {
		super();
		this.cartId = cartId;
		this.customerId = customerId;
		this.toatalAmount = toatalAmount;
		this.paymentStatus = paymentStatus;
		this.orderStatus = orderStatus;
	}
	
	
}
