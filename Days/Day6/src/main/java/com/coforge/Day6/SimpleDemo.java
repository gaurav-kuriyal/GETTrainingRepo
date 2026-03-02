package com.coforge.Day6;

public class SimpleDemo {
	
	public static void calculate() {
		int a=5,b=0;
		if(b==0)
			throw new ArithmeticException();
		else
			System.out.println(a/b);
	}
	
	public static void checkAge(int age) throws AgeNotSufficientException {
		if(age>15)
			System.out.println("Eligible to register plus two");
		else
			throw new AgeNotSufficientException("Age not equal or more than 15");
	}
	
	public static void main(String[] args) {
		try {
			calculate();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			e.getMessage();
		}
	
		try {
//			checkAge(18);
			checkAge(14);
		} catch (AgeNotSufficientException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Application Completed");
	}
}
