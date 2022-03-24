package com.capg.work;

public class Student {

//	static String name; // class variable
//	int rollNo; // instance variable
//	
//	void display(int r) { // local variable
//		
//	}
	String name;
	int rollNo;
	Student(){
		System.out.println("Student is studying");
	}
	
	Student(int r){
		
		rollNo=r;
		
	}
	Student(String n, int r){
		name=n;
		rollNo=r;
	}
	
	void display() {
		System.out.println(rollNo+" " + name );
	}
	public static void main(String[] args) {
//		Student s = new Student();
//		s.display();
		Student s1 = new Student();
		s1.display();
		
		Student s2 = new Student(30);
		s2.display();
		
		Student s3= new Student("Mohit", 5);
		s3.display();
		
	}
	
	
}
