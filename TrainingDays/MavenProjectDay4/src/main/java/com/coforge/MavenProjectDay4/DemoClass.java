package com.coforge.MavenProjectDay4;

public class DemoClass implements MyInterface {

	@Override
	public void display() {
		System.out.println("Display from Demo Class");
	}

	@Override
	public void printDetails() {
//		MyInterface.super.printDetails();
		System.out.println("Print Details from Demo Class");
	}
	
	static void hey() {
		System.out.println("Hey");
	}
	

}
