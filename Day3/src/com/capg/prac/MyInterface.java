package com.capg.prac;

interface MyInterface1{
	int a=5;
	void show();
	void display();
	
}
interface MyInterface2{
	int a=12;
	void show();
}
public class MyInterface implements MyInterface1,MyInterface2{
	@Override
	public void show() {
		System.out.println("Showing " + MyInterface1.a + " " + MyInterface2.a);
	}
	public static void main(String[] args) {
		MyInterface2 m = new MyInterface();
		m.show();
//		System.out.println(MyInterface.a);
//		System.out.println(MyInterface1.a);
//		MyInterface1 mn = new MyInterface1() {
//			
//			@Override
//			public void show() {
//				// TODO Auto-generated method stub
//				System.out.println("Showing interface");
//			}
//		};
//		mn.show();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display");
	}
}
