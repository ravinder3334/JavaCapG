package com.capg.work;

public class Student2 {
	String name; // Instance variable
	int id;
	
	
	
	 public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

	public Student2(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	public void display() {
		 System.out.println(name + " " + id);
	 }
	
	public static void main(String[] args) {
		Student2 s = new Student2("Rohit", 13);
		
		System.out.println(s);
	}
}
