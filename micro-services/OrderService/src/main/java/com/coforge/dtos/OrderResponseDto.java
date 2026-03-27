package com.coforge.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderResponseDto {
	private long orderId;
	private String customerName;
	private String itemName;
	private int quantity;
	private double toatalAmount;
	private String paymentStatus;
	private String orderStatus;
}
