package com.capg.work;

class UserDefinedExeption extends Exception{
	public void ourException() {
		System.out.println("Under Age");
	}
	public void show() {
		System.out.println("Showing");
	}
	public UserDefinedExeption(String str) {
		super(str);
	}
}
public class MyUserDefinedException {
	public static void main(String[] args) {
		int age=16;
		try {
			if(age<18) {
				throw new UserDefinedExeption("Our Exception is running");
			}
		}catch(UserDefinedExeption e) {
			System.out.println(e.getMessage());
//			e.ourException();
//			e.show();
//			System.out.println(e);
//			System.out.println("Exception occured");
		}
	}
}
