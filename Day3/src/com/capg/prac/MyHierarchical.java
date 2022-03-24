package com.capg.prac;

 class Animal{ // parent
	 public void eat() {
		 System.out.println("In class Animal Eating");
	 }
 }
 class Dog extends Animal{ // child
	 public void bark() {
		 System.out.println("In class Dog Barking");
	 }
 }
 class Cat extends Animal{ // child
	 public void sleep() {
		 System.out.println("In class Cat Sleeping");
	 }
 }
public class MyHierarchical {

	public static void main(String[] args) {
//		Cat c = new Cat();
//		c.sleep();
//		c.eat();
		
		Dog d = new Dog();
		d.bark();
		d.eat();
		
	}
}
