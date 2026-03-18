package com.coforge.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="custid")
	private long custId;
	@Column(name="custname")
	private String custName;
	private String city;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="customer")
//	@JoinColumn(name="custid")
	private List<Order> orders;

	public Customer(String custName, String city, List<Order> orders) {
		super();
		this.custName = custName;
		this.city = city;
		this.orders = orders;
	}

	public Customer(String custName, String city) {
		super();
		this.custName = custName;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", city=" + city + "]";
	}

	
	
	
}
