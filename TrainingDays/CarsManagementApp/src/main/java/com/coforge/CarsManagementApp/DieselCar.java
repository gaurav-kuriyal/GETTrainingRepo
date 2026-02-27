package com.coforge.CarsManagementApp;

public class DieselCar extends Car implements AddOns {

	@Override
	public void EngineType() {
		System.out.println("Diesel type");

	}
	@Override
	public void audioSystem() {
		System.out.println("Audio System with 8 speakers, woofers enabled");
	}

	public DieselCar(String model) {
		super(model);
	}

}
