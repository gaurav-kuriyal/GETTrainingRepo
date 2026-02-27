package com.coforge.CarsManagementApp;

public class CarsMain {

	public static void main(String[] args) {
		PetrolCar pcar = new PetrolCar("Swift");
		pcar.EngineType();
		pcar.audioSystem();
		pcar.ShowModel();
		pcar.roofOpen();
		pcar.showWarrantyPolicy();
		
		DieselCar dcar = new DieselCar("Nexon");
		dcar.EngineType();
		dcar.audioSystem();
		dcar.ShowModel();
		dcar.roofOpen();
		dcar.showWarrantyPolicy();
	}

}
