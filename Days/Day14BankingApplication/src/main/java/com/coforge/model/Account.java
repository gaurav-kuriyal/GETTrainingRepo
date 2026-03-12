package com.coforge.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
	private int accNo;
	private String accHolderName;
	private String accType;
	private double balance;
}
