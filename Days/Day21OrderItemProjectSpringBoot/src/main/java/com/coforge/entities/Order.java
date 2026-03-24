package com.coforge.entities;

import java.time.LocalDate;
//import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long orderid;
	private LocalDate orderDate;
	private double totalAmount;
	
	@ManyToMany(cascade= CascadeType.ALL)
	@JoinTable(name="order_items",joinColumns = @JoinColumn(name="orderid"),inverseJoinColumns = @JoinColumn(name="itemid"))
	private Set<Item> items;

	public Order(LocalDate orderDate, double totalAmount) {
		super();
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
	}

	public Order(LocalDate orderDate, double totalAmount, Set<Item> items) {
		super();
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
		this.items = items;
	}
	
	
	public void addItem(Item item) {
		this.items.add(item);
		item.getOrders().add(this);
	}
	public void removeItem(Item item) {
		this.items.remove(item);
		item.getOrders().remove(this);
	}
	
}
