package com.capg.prac;

class A{
	public void show() {
		System.out.println("Showing class A");
	}
}
class B extends A{
	public void display() {
		System.out.println("In Class B");
	}
}
public class MyMultilevel extends B{

	public void multi() {
		System.out.println("In multilevel");
	}
	
	public static void main(String[] args) {
		MyMultilevel m = new MyMultilevel();
		B b = new B();
		A a = new A();
//		m.show();
//		m.display();
//		m.multi();
		
		System.out.println(a instanceof A); // true or false
	}
}
