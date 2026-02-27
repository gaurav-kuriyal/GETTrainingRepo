package com.coforge;

public class Calculator implements SimpleCalculatorInterface, ScientificCalculatorInterface {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	@Override
	public int subtract(int a, int b) {
		return a - b;
	}
	
	@Override
	public double divide(int a, int b) {
		return a/b;
	}
	
	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public double power(double a, double b) {
		return Math.pow(a, b);
	}

	@Override
	public double squareRoot(double d) {
		return Math.sqrt(d);
	}

	@Override
	public double logValue(double num) {
		return Math.log10(num);
	}
	
	
}
