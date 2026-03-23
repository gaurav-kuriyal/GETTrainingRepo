package com.coforge;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DemoClass {

	public static void main(String[] args) {
		Integer[] arr = {12,234,123,121,23,22,56,787,343,7,25};
		List<Integer> list = Arrays.asList(arr);
		// intermediate operation
		// terminal operation
		list.stream().forEach((i)->System.out.println(i)); //forEach is terminal Operation
	
		System.out.println("---------------------------------------------------");
		list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		System.out.println("---------------------------------------------------");
		list.stream().filter(i->i%2==0).map(i->i*2).forEach(i->System.out.println(i));
		System.out.println("---------------------------------------------------");
		List<Integer> collectedList = list.stream().filter(i->i%2==0).map(i->i*2).limit(3).sorted().collect(Collectors.toList());
		System.out.println(collectedList);
	}

}
