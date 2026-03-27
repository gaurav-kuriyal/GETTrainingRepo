package com.coforge.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {
	private long itemId;
	private String itemName;
	private double itemPrice;
	private int quantity;
}
