package com.coforge.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
	private long customerId;
	private String customerName;
	private String mobile;
	private String email;
}
