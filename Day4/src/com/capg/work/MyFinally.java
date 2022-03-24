package com.capg.work;

public class MyFinally {

	public static void main(String[] args) {
		try{ 
			int a=20/0;
		}
		finally {
			System.out.println("Finally Working");
		}
		System.out.println("Ending");
	}
}
