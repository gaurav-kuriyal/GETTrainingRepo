package com.coforge;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator sc = new Calculator();
		
		System.out.println(sc.add(4, 5));
		System.out.println(sc.subtract(4, 5));
		System.out.println(sc.multiply(4, 5));
		System.out.println(sc.divide(4, 2));
				
		System.out.println(sc.power(4, 2));
		System.out.println(sc.squareRoot(16));
		System.out.println(sc.logValue(100));
	}

}
