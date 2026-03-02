package com.coforge.Day5;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerArrayList {
	public static void main(String[] args) {
		Customer c1 = new Customer(1,"Gaurav","Hyderabad",3232);
		Customer c2 = new Customer(45,"Rajat","Ghaziabad",78787);
		Customer c3 = new Customer(121,"Mayank","Lucknow",65436);
		Customer c4 = new Customer(124,"Mohit","Mathura",23434);
		Customer c5 = new Customer(1123,"Hritik","Chapra",199234);
		Customer c6 = new Customer(123,"Yugraj","Chapra",76543);
		
		ArrayList<Customer> custList = new ArrayList<Customer>();
		custList.add(c1);
		custList.add(c2);
		custList.add(c3);
		custList.add(c4);
		custList.add(c5);
		custList.add(c6);
		
//		Collections.sort(custList);
//		custList.sort(new OrderCostComparator());
		custList.sort(new CityComparator().thenComparing(new OrderCostComparator()));
		custList.forEach(cust->System.out.println(cust));
	}
}
