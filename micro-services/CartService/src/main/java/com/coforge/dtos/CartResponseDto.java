package com.coforge.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartResponseDto {
	private long cartId;
	private long customerId;
	private long itemId;
	private String itemName;
	private double itemPrice;
	private int quantity;
}
