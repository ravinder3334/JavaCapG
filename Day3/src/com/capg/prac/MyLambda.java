package com.capg.prac;

@FunctionalInterface
interface Show2{
	void show();
}

@FunctionalInterface
interface Add{
	int add(int a, int b);
}
public class MyLambda {
	
	public static void main(String[] args) {
		
		Show2 s = () -> {
			System.out.println("Hello");
		};
		s.show();
		
		Add ad = (int a, int b) -> {
			return a+b;
		};
		
		System.out.println(ad.add(20, 5));
		
		Add ad2 = (a,b) -> a+b;
		System.out.println(ad2.add(12, 2));
	
	}
	
	
	
	
	
}
