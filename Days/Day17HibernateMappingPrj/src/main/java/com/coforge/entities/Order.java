package com.coforge.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="order_table")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ordid")
	private long ordId;
	@Column(name="prodname")
	private String prodName;
	@Column(name="amount")
	private double amount;
	
	@ManyToOne
	@JoinColumn(name="custid")
	private Customer customer;
	
	public Order(String prodName, double amount) {
		super();
		this.prodName = prodName;
		this.amount = amount;
	}
	
	
}
