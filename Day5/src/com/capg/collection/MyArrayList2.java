package com.capg.collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int rollNo;
	String name;
	int age;
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

public class MyArrayList2 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Mohit", 15);
		Student s2 = new Student(3, "Shyam", 16);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		
		Iterator<Student> itr = al.iterator();
		while(itr.hasNext()) {
//			Student st = itr.next();
//			System.out.println(st.rollNo + " " + st.name + " "+ st.age);
			System.out.println(itr.next());
		}
		
	}
}
