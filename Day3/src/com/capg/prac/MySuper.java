package com.capg.prac;

class MySuper1{ 
	public String name="Aman";
	public void sleep() {
		System.out.println("Sleeping Super1 Aman");
	}
	MySuper1(){
		System.out.println("Constructor Working");
	}
}
public class MySuper extends MySuper1{
	public String name = "Rohan";
	
	public void display() {
//		System.out.println(name); // Rohan
		System.out.println(super.name); // Aman
	}
	
	public void sleep() {
		System.out.println("Sleeping Super Rohan");
		super.sleep();
	}
	MySuper(){
//		super();
		System.out.println("Constructor of Super working");
	}

	public static void main(String[] args) {
		MySuper m = new MySuper();
//		m.display();
//		m.sleep();
	}
}
