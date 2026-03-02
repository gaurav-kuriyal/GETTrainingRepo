package com.coforge.Day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoOnTryCatch {
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
	public static void readFile() throws FileNotFoundException {
		FileReader reader = new FileReader("data.txt");
		System.out.println("finished");
	}
	public static void main(String[] args) {
//		int a =5,b=0;
//		
//		int arr[] = {1,2,3,4}; 
//		try {
//			System.out.println(arr[9]);
//			System.out.println(a/b);
//		}
//		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//			System.out.println("Composite Exception occured");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
////			System.out.println(e.getCause());
//		}
////		catch (ArithmeticException e) {
////			System.out.println("Arithmetic Exception occured");
////			e.printStackTrace();
////			System.out.println(e.getMessage());
//////			System.out.println(e.getCause());
////		}
////		catch (ArrayIndexOutOfBoundsException e) {
////			System.out.println("Array Index out of Bounds Exception occured");
////			e.printStackTrace();
////			System.out.println(e.getMessage());
////		}
//		
//		catch (Exception e) {
//			System.out.println("Exception occured");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
////			System.out.println(e.getCause());
//		}
//		finally {
//			System.out.println("Exception handled");
//		}
		
		
//		String s = null;
//		try {
//			System.out.println(s.charAt(3));
//		}
//		catch (NullPointerException ne) {
//			ne.printStackTrace();
//		}
//		finally {
//			System.out.println("Aplication completed");
//		}
		
//		File f = new File("data4.txt");
////		if(f!=null)
////			System.out.println("File exists");
////		else
////			System.out.println("File not exists");
//		
//		try {
//			throw new FileNotFoundException();
//		}catch (FileNotFoundException ne) {
////			ne.printStackTrace();
//			System.out.println("Exception handled");
//		}
		
//		FileReader reader = null;
//		try {
//			reader = new FileReader("data.txt");
//			int ch;
//			while((ch=reader.read())!=1)
//				System.out.println((char) ch);
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		finally {
//			System.out.println("ookk");
//			try {
//				if(reader != null)
//					reader.close();
//				System.out.println("hh");
//			}
//			catch(IOException e) {
//				e.getMessage();
//			}
//		}
		
		
		try {
			readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Executed");
	}

}
