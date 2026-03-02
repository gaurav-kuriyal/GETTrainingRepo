package com.coforge.Day6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class DemoOnMap {

	public static void main(String[] args) {
//		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
//		hashMap.put(1, "Gaurav");
//		hashMap.put(4, "Mayank");
//		hashMap.put(2, "Rajat");
//		hashMap.put(5, "Mohit");
//		
//		System.out.println(hashMap);
//		for(Integer key: hashMap.keySet())
//			System.out.println(key);
//		
//		for(String value: hashMap.values())
//			System.out.println(value);
//		
//		System.out.println(hashMap.containsKey(3));
//		System.out.println(hashMap.containsValue("Gaurav"));
//	
//		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
//		System.out.println(entrySet);
//		
//		Iterator<Entry<Integer,String>> itr = entrySet.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		
//		System.out.println(hashMap.get(5));
		
		TreeMap<Integer, String> fruitTree = new TreeMap<Integer, String>();
		fruitTree.put(1,"Apple");
		fruitTree.put(2,"Mango");
		fruitTree.put(3,"Banana");
		fruitTree.put(4,"Cherry");
		
//		fruitTree.forEach(BiConsumer<a, b>->System.out.println(a,b));.
		System.out.println(fruitTree);
		
		for(Integer key: fruitTree.keySet())
			System.out.println(key);

		for(String value: fruitTree.values())
			System.out.println(value);
	}

}
