package com.coforge.Day6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor
public class Account {
	private long accId;
	private String accHolderName;
	private String bankName;
	private double balance;
	
	public void withDraw(double amount) throws InsufficientFundsException {
		if(amount <= this.balance) {
			this.balance -= amount;
			System.out.println("Withdraw Successfull "+"amount= "+amount+" new balance= "+this.balance);
		}
		else {
			System.out.println("Insufficient funds "+"amount= "+amount);
			throw new InsufficientFundsException();
		}
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Deposit Successfull "+"amount= "+amount+" new balance= "+this.balance);
		
	}
}
