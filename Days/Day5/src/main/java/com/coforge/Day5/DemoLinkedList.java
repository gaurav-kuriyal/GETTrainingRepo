package com.coforge.Day5;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.add(1);
		llist.add(2);
		llist.add(3);
		llist.add(4);
		
//		System.out.println(llist);
		
		llist.addFirst(0);
		llist.addLast(99);

		System.out.println(llist);
		
//		System.out.println(llist.element());
		
		LinkedList<Integer> llist2 = new LinkedList<Integer>();
		llist2.add(1);
		llist2.add(2);
		llist2.add(3);
		llist2.add(4);
		
//		llist2.addFirst(0);
//		llist2.addLast(99);
		
		System.out.println(llist2);
//		System.out.println(llist.equals(llist2));
//		System.out.println(llist.contains(llist2));
		
//		System.out.println(llist.hashCode());
//		System.out.println(llist2.hashCode());
		
//		System.out.println(llist.peek());
//		System.out.println(llist.poll()); //removes first value
//		System.out.println(llist.pollFirst());
//		System.out.println(llist.pollLast()); 
//		System.out.println(llist);
//		System.out.println(llist.pop());
//		System.out.println(llist);
//		System.out.println(((List<Integer>) llist).reversed());
		
		Iterator<Integer> itr = llist.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
//		Create employee linked list with 10 records
//		Sort using collection.sort on salary based
//		sort using comparators, branch, dept, name, salary
//		ename,eid, salary, dept, branch
	}
}
