package com.coforge.Day5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoOnTreeSet {
	public static void main(String[] args) {
		TreeSet<Student> studentTree = new TreeSet<Student>();
		Student s1 = new Student(123,"Gaurav",95);
		Student s2 = new Student(433,"Mayank",56);
		Student s3 = new Student(733,"Rajat",66);
		Student s4 = new Student(423,"Mohit",85);
		Student s5 = new Student(533,"Hritik",36);
		Student s6 = new Student(633,"Yugraj",76);
		
		studentTree.add(s1);
		studentTree.add(s2);
		studentTree.add(s3);
		studentTree.add(s4);
		studentTree.add(s5);
		studentTree.add(s6);
		
//		System.out.println(studentTree);
//		studentTree.forEach(s->System.out.println(s));
		
		Iterator<Student> itr = studentTree.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		itr = studentTree.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Set<Student> set = studentTree.descendingSet();
		
		System.out.println(set);
		set.forEach(s->System.out.println(s));
		
		System.out.println(studentTree.subSet(s4, s6));
		Student fromStud = new Student(423,"",0);
		Student toStud = new Student(633,"",0);
		System.out.println(studentTree.subSet(fromStud, toStud));
		
		Student s = new Student(430,"",0);
		System.out.println(studentTree.ceiling(s));
		System.out.println(studentTree.floor(s));
		System.out.println(studentTree.higher(s));
		System.out.println(studentTree.lower(s));

	}
}
