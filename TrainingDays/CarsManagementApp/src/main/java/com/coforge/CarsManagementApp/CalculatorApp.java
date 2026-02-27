package com.coforge.CarsManagementApp;

public class CalculatorApp {

	public static void main(String[] args) {
		CalculatorInterface ca = (a,b)->a+b;
		
		System.out.println(ca.add(3, 2));
	}

}
