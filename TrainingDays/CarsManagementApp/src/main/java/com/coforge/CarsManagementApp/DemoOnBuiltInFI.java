package com.coforge.CarsManagementApp;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnBuiltInFI {
	public static void main(String[] args) {
		
//		Supplier
		Supplier<String> sayHello = ()-> "Hello";
		System.out.println(sayHello.get());

		Supplier<Double> randomSupplier = ()-> Math.random();
		System.out.println(randomSupplier.get());

		Supplier<Integer> otpSupplier = ()-> (int) (Math.random()*1000);
		System.out.println(otpSupplier.get());
		
//		Consumer
		Consumer<String> strConsumer = (str)->System.out.println(str.toUpperCase());
		strConsumer.accept("Rajat");
		
		Consumer<Integer> squareConsumer = (num)->System.out.println(num*num);
		squareConsumer.accept(6);
		
//		Function
		Function<Integer, String> isEven = (num)->(num%2==0?"Even":"Odd");
		System.out.println(isEven.apply(345));
		
//		Predicate
		Predicate<Integer> checkEven = (num)->num%2==0;
		System.out.println(checkEven.test(34));
		
		String a = new String("Mayank");
		String b = "Mayank";
		System.out.println(a.equals(b));
		
		Predicate<String> authenticateUsername = (uname)->uname.equals("Gaurav");
		Predicate<String> authenticatePassword = (pswd)->pswd.equals("Gaurav@123");
		
		Predicate<String>  validateUsername = (uname)->{
			if(uname.length()<=3) {
				return false;
			}
			else if(uname == null) {
				return false;
			}
			else if(uname.trim().length() <= 3) {
				return false;
			}
			
			return true;
		};
		
		System.out.println("valid?= "+validateUsername.test("Gaurav"));
		
	}
}
