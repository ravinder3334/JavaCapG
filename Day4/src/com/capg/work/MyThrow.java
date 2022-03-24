package com.capg.work;

public class MyThrow {

	// throws 
	public static void grade(int marks)  {
		if(marks<33) {
			throw new ArithmeticException("Work harder");
		}
		else {
			System.out.println("Doing good");
		}
	}
	public static void main(String[] args) {
//		MyThrow.grade(40);
		grade(12);
	}
}
