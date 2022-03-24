package com.capg.work;

public class MyMultipleCatch {

	public static void main(String[] args) {
		try {
			int arr[]= new int[5];
			String str="Ram";
			System.out.println(str.charAt(10)); // Main/ Exception
			
			
			arr[3]=10/0;	// Arithmetic
			
			System.out.println("Continuing");
			System.out.println(arr[10]); // Array
		}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception ");
		}
		catch(RuntimeException e) {
			
//			System.out.println(e);
		}
		
		
		System.out.println("Ending");
		
	}
}
