package com.capg.prac;
class MyOverride1{
	
	public  void sleep() {
		System.out.println("Sleeping in parent class");
	}
}
public class MyOverride extends MyOverride1{

	@Override
	public void sleep() {
		System.out.println("Sleeping in child class");
	}
	
	
	public void show() {
		System.out.println("Showing");
	}
	
	public static void main(String[] args) {
		MyOverride1 m = new MyOverride();
		MyOverride1 n = new MyOverride1();
		n.sleep();
//		m.sleep();
		System.out.println(n instanceof MyOverride);
	}
}
