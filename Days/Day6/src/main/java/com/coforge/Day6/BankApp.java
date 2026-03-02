package com.coforge.Day6;

public class BankApp {

	public static void main(String[] args){
		Account acc = new Account(1234342,"Gaurav","HSBC",20000);
		try {
			acc.withDraw(25000);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			acc.withDraw(1000);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		acc.deposit(100000);
		try {
			acc.withDraw(30000);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
