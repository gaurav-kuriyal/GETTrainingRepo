package com.coforge.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	private int ordId;
	@Column(name="customername")
	private String custName;
	@Column(name="ordername")
	private LocalDate ordDate;
//	private List<Item> itemList;
}
