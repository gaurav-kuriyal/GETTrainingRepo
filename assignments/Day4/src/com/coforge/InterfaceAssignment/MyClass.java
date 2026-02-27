package com.coforge.InterfaceAssignment;

public class MyClass implements MyInterface {

	@Override
	public void greet(String name) {
		System.out.println("Hello "+name);
	}
	
}
