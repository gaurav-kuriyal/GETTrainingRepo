package com.coforge.CarsManagementApp;

public abstract class Car {
	private String model;

	public Car() {
		super();
	}

	public Car(String model) {
		super();
		this.model = model;
	}
	
	public abstract void EngineType();
	
	public void ShowModel() {
		System.out.println("Model: "+this.model);
	}
	
	public void showWarrantyPolicy() {
		AddOns.WarrantyPolicy();
	}
}
