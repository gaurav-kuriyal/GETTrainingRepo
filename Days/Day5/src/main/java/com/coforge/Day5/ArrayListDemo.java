package com.coforge.Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
//		ArrayList alist = new ArrayList();
//		
//		alist.add("Gaurav");
//		alist.add(22);
//		alist.add(234.5);
//		
//		for(int i=0;i<alist.size();i++)
//			System.out.print(alist.get(i)+" ");
//		
//		System.out.println("\n--------------------------");
//		alist.add("Gaurav");
//		alist.add(22);
//		alist.add(234.5);
//		alist.add(null);
//		
//		for(int i=0;i<alist.size();i++)
//			System.out.print(alist.get(i)+" ");
//		
//		System.out.println(alist);

		ArrayList<Integer> intAlist = new ArrayList<Integer>();
		intAlist.add(3);
		intAlist.add(12);
		intAlist.add(13);
		intAlist.add(23);
		intAlist.add(4,39);
//		intAlist.add(null);
		
//		for(int i =0;i < intAlist.size();i++)
//			System.out.println(intAlist.get(i));
//		
//		for(Integer i: intAlist)
//			System.out.println(i);
//		
//		Iterator<Integer> itr = intAlist.iterator();
//		while(itr.hasNext()) {
//			Integer i = itr.next();
//			if(i==12)
//				itr.remove();
//			System.out.println(i);
//		}
//		System.out.println(intAlist);
		
//		ListIterator<Integer> listItr = intAlist.listIterator();
//		
//		while(listItr.hasNext()) 
//			System.out.println(listItr.next());
//		
//		while(listItr.hasPrevious())
//			System.out.println(listItr.previous());
		
		ArrayList<Integer> alist =new  ArrayList<Integer>();
		alist.add(34);
		alist.add(0);
//		alist.addAll(intAlist);
//		System.out.println(alist);
		
		alist.addAll(1,intAlist);
		alist.add(4,39);
		System.out.println(alist);
//		Integer i = 3;
//		alist.remove(i);
//		System.out.println(alist);
//		
//		alist.removeAll(intAlist);
//		System.out.println(alist);
	
		intAlist.replaceAll(e->e+10);
		System.out.println(intAlist);
		
//		intAlist.clear();
//		System.out.println(intAlist);
		
//		Integer i = 3;
//		intAlist.addFirst(i);
//		System.out.println(intAlist);
		
//		ArrayList<Integer> clonedArrayList =(ArrayList<Integer>) intAlist.clone();
//		System.out.println(clonedArrayList);
		
//		System.out.println(intAlist.hashCode());
//		System.out.println(clonedArrayList.hashCode());
		
//		clonedArrayList.add(45);
//		alist.add(45);
//		System.out.println(clonedArrayList);
//		System.out.println(intAlist);
//		System.out.println(intAlist.hashCode());
//		System.out.println(clonedArrayList.hashCode());
		
//		System.out.println(intAlist.contains(13));
//		System.out.println(intAlist.containsAll(alist));
		
//		alist.forEach(e->System.out.println(e));
//		System.out.println(alist.indexOf(13));
		
//		intAlist.retainAll(alist);
//		System.out.println(intAlist);

//		System.out.println(alist.toString().getClass());
//		System.out.println(alist.getClass());
		
		Collections.sort(alist);
		System.out.println(alist);
		
	}
}
