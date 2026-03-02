package com.coforge.Day5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Predicate;

public class DemoOnHashset {

	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<Integer>();
		
		hset.add(12);
		hset.add(34);
		hset.add(46);
		hset.add(47);
		hset.add(63);
		hset.add(91);
		hset.add(56);
		
//		System.out.println(hset);
		
		hset.add(91);
		
//		System.out.println(hset);
		
//		hset.add(null);
//		hset.add(null);
//		System.out.printjln(hset);
//		
//		for(Integer i: hset)
//			System.out.println(i);
		
		Predicate<Integer> checkEven = (a)->a%2==0;
		hset.removeIf(checkEven);
		
//		System.out.println(hset);
		
		
		LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
		lset.add(12);
		lset.add(34);
		lset.add(46);
		lset.add(47);
		lset.add(63);
		System.out.println(lset);
		
		Iterator<Integer> itr = lset.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
