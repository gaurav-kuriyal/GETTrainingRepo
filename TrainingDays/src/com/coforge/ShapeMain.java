package com.coforge;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		
		String type;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Shape Type: ");
		type = sc.next();
		
		ShapeInterface sh;
		
		if(type.equals("Circle")) {
			System.out.println("Enter Radius: ");
			double r = sc.nextDouble();
			sh = new Circle(r);
			System.out.println(sh.area());
			System.out.println(sh.perimeter());
		}
		else if(type.equals("Square")){
			System.out.println("Enter Side: ");
			double s = sc.nextDouble();
			sh = new Square(s);
			System.out.println(sh.area());
			System.out.println(sh.perimeter());
			
		}
		else {
			System.out.println("Invalid Shape");
		}
		
//		Circle c = new Circle(8);
//		System.out.println(c.area());
//		System.out.println(c.perimeter());
//		
//		Square sq = new Square(16);
//		System.out.println(sq.area());
//		System.out.println(sq.perimeter());
		
		sc.close();
	}

}
