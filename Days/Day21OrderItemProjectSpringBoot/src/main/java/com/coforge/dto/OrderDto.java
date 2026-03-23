package com.coforge.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderDto {
	private long orderid;
	private LocalDate orderDate;
	private double totalAmount;
	
	private List<ItemDto> itemList;

	public OrderDto(LocalDate orderDate, double totalAmount, List<ItemDto> itemList) {
		super();
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
		this.itemList = itemList;
	}

	public OrderDto(LocalDate orderDate, double totalAmount) {
		super();
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
	}
	
	
	
}
