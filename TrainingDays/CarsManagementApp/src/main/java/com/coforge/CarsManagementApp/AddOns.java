package com.coforge.CarsManagementApp;

public interface AddOns{
	public default void audioSystem() {
		System.out.println("Audio System, by default 2 speakers");
	}

	public default void roofOpen() {
		System.out.println("By default roof open disabled");
	}
	
	public static void WarrantyPolicy() {
		System.out.println("Warranty policy: 3 years");
	}
}