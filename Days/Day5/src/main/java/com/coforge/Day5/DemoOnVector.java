package com.coforge.Day5;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class DemoOnVector {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
//		System.out.println(v.capacity());
//		v.ensureCapacity(45);
		
		v.add(23);
		v.add(21);
		v.add(456);
		v.add(27);
		v.add(23);
		v.add(21);
		v.add(456);
		v.add(27);
		v.add(27);
		v.add(456);
		v.add(456);
		v.add(456);
		
		System.out.println(v);
//		System.out.println(v.capacity());
//		System.out.println(v.size());
		
//		Enumeration<Integer> enums = v.elements();
//		while(enums.hasMoreElements())
//			System.out.println(enums.nextElement());
		
//		System.out.println(v.capacity());
//		v.trimToSize();
//		System.out.println(v.capacity());
//		
//		v.add(45);
//		System.out.println(v.capacity());
		
		Vector<Integer> v2 = new Vector<Integer>();
		
		v2.add(12);
		v2.add(34);
		v2.add(46);
		v2.add(47);
		v2.add(63);
		v2.add(91);
		v2.add(56);
		
		System.out.println(v2);
		
		v.addAll(2, v2);
		System.out.println(v);
		
		Integer[] arr = v.toArray(new Integer[0]);
		System.out.println(arr[2]);
		
		Integer[] arr2 = {12,34,12,56,78,44};
		List<Integer> list = Arrays.asList(arr2);
		
	}
}
