package com.coforge;

public class Circle implements ShapeInterface {
	private double radius;
	
	public Circle() {
		super();
	}
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		return 3.14*radius*radius;
	}

	@Override
	public double perimeter() {
		return 2*3.14*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
