package com.capg.work;

public class MyExcetion {

	public static void main(String[] args) {
		
//		try {
//			int a=100/0;
//		}
//		catch(ArithmeticException exc) {
//			System.out.println(exc);
//		}
//		try {
//		String str=null;
//		System.out.println(str.length());
//		}
//		catch(NullPointerException e) {
//			System.out.println(e);
//		}
		
//		try {
//			String s="Shyam";
//			int i = Integer.parseInt(s);
//		}catch(NumberFormatException e) {
//			System.out.println(e);
//		}
//		try {
//			int arr[] = new int[5];
//			arr[5]=23;
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
		try {
			String str="Rohan";
			System.out.println(str.charAt(8));
		}catch(Exception a) {
			System.out.println(a);
		}
		
		System.out.println("Ending");
	}
	
	
	
}
