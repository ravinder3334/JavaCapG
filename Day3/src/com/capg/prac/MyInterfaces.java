package com.capg.prac;

interface MyInterfaces1{
	default void show() {
		System.out.println("Showing in interface");
	};
	static void display() {
		System.out.println("Displaying in interface");
	};
}
public class MyInterfaces implements MyInterfaces1{
	public void show() {
		System.out.println("Showing in subclass");
	}
	static void display(){
		System.out.println("Displaying in subclass");
	}
	public static void main(String[] args) {
		MyInterfaces m = new MyInterfaces();
		m.show();
//		MyInterfaces1.display();
//		MyInterfaces.display();
//		MyInterfaces1 mn = new MyInterfaces1() {};
//		mn.show();
		
		
	}

}
