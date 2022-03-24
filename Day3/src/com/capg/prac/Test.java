package com.capg.prac;

interface Printable{
	void print();
//	void display();
}
interface Show extends Printable{
	void show();
}
public class Test implements Show{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.print();
		t.show();
	}

}
