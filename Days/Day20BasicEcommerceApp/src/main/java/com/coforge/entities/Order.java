package com.coforge.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	private long ordid;
	private LocalDate orderDate;
	private double amount;
	private String orderStatus;
	
	@ManyToOne
	@JoinColumn(name="cid")
	private Customer customer;
	
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Item> itemList;
	
	@OneToOne(mappedBy="order",cascade = CascadeType.ALL)
	private Payment payment;

	public Order(LocalDate orderDate, double amount, String orderStatus, Customer customer, List<Item> itemList,
			Payment payment) {
		super();
		this.orderDate = orderDate;
		this.amount = amount;
		this.orderStatus = orderStatus;
		this.customer = customer;
		this.itemList = itemList;
		this.payment = payment;
	}

	
	
	
}
