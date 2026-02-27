package com.coforge.CarsManagementApp;

import java.util.Scanner;

public class DemoOnArray {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements: ");
		for(int i =0;i<arr.length;i++)
			arr[i] = sc.nextInt();

		System.out.println("Array: ");
		for(int i =0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		System.out.println("Even numbers in array: ");
		for(int i =0;i<arr.length;i++)
			if(arr[i]%2==0)System.out.println(arr[i]);
		
		int sum = 0;
		for(int i =0;i<arr.length;i++)
			sum+=arr[i];
		System.out.println("Sum of numbers in array: "+sum);
	}

}
