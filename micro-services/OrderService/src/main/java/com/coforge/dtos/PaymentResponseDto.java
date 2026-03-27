package com.coforge.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentResponseDto {
	private long paymentId;
	private long orderId;
	private double amount;
	private String status;
}
