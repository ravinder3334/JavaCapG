package com.capg.prac;

class Addition{
	static int add(int a, int b) {  // datatype different
		System.out.println("First");
		return a+b;
	}
	static double add(double a, double b) { // datatype different
		System.out.println("Second");
		return a+b;
	}
	
	static int add(int a, int b, int c) { // changed the number of parameters
		System.out.println("Third");
		return a+b+c;
	}
}
public class MyOverLoad {

	public static void main(String[] args) {
		
		System.out.println(Addition.add(12.0d,37.9d));
		System.out.println(Addition.add(15, 7));
		System.out.println(Addition.add(34, 10, 20));
		
	}
}
