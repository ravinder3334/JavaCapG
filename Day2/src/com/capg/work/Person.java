package com.capg.work;

public class Person {

	// float :Float char: Character , long : Long ,
//		double: Double
	
	public static void main(String[] args) {
		int a = 10;
		Integer ai = new Integer(a); // Boxing
//		System.out.println(ai);
		Integer bi = a; // AutoBoxing
//		System.out.println(bi);
		
//		int j = bi.intValue(); // UnBoxing
//		System.out.println(j);
		
		int j =bi; // AutoUnBoxing
		System.out.println(j);
		
		// Collections: primitive not allowed..
		// 				Classes and Objects.
		
		
	}
}
