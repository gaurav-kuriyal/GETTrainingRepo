package com.coforge.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CurrentAccount extends Account {
	private double odLimit;

	public CurrentAccount(String accountHolderName, String accountBalance, double odLimit) {
		super(accountHolderName, accountBalance);
		this.odLimit = odLimit;
	}
	
	
}
