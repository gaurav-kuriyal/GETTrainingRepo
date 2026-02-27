package com.coforge.MavenProjectDay4;

public interface MyInterface {
	public void display();
	
	public default void printDetails() {
		System.out.println("Default method of MyInterface invoked");
	}
	
	public static void UseParking(String companyName) {
		System.out.println("This is "+companyName+" using parking area");
	}
}
