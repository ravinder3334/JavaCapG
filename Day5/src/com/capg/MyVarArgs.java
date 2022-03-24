package com.capg;

public class MyVarArgs {
	
	public static void display(int b,String... val) {
		System.out.println("Displaying");
		System.out.println(b);
		for(String i: val) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		String []val= {"rohit","aman","Shyam"};
		display(3,val);
		display(4,"Rohan","Ram");
		
	}
}
