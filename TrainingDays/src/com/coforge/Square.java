package com.coforge;

public class Square implements ShapeInterface {
	private double side;
	
	public Square() {
		super();
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double area() {
		return side*side;
	}

	@Override
	public double perimeter() {
		return 4*side;
	}
	
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
}
