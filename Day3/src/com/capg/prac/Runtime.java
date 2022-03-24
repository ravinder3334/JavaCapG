package com.capg.prac;

class Animal3{
	void eat() {
		System.out.println("Animal Eating");
	}
}
class Dog3 extends Animal3{
	@Override
	void eat() {
		System.out.println("Dog Eating");
	}
}
class Cat3 extends Animal3{
	@Override
	void eat() {
		System.out.println("Cat Eating");
	}
}
class Lion3 extends Animal3{
	@Override
	void eat() {
		System.out.println("Lion Eating");
	}
}
public class Runtime {
	public static void main(String[] args) {
		Animal3 a; // reference variable of super class
		
		a= new Dog3();
		a.eat();
		
		a= new Cat3();
		a.eat();
		
		a= new Lion3();
		a.eat();
		
		
	}
}
