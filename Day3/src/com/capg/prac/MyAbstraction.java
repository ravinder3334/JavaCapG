package com.capg.prac;

abstract class MyAbstraction1{
	abstract void show();
	void display() {
		System.out.println("Displaying");
	}
	
	public MyAbstraction1() {
		// TODO Auto-generated constructor stub
		System.out.println("Working");
	}
	final static void msg() {
		System.out.println("Printing");
	}
}

//abstract class MyAbstraction2{
//	abstract void show1();
//}

public class MyAbstraction extends MyAbstraction1{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing");
	}

	public static void main(String[] args) {
		MyAbstraction m = new MyAbstraction(); // Working
		m.show();
//		m.display();
		
		MyAbstraction1 n = new MyAbstraction1() {
			@Override
			void show() {
				System.out.println("Showing from super class");
			}
		}; // Working
//		n.show();
//		MyAbstraction.msg();
//		MyAbstraction1.msg();
		
//		n.display();
	}
}
