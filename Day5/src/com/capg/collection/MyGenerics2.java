package com.capg.collection;

class Generics2<A,B>{
	A name;
	B bill;
	void add(A name, B bill) {
		this.name=name;
		this.bill=bill;
	}
	A getName() {
		return name;
	}
	B getBill() {
		return bill;
	}
}
public class MyGenerics2 {
	public static void main(String[] args) {
		Generics2<String,Integer> s = new Generics2<String,Integer>();
		s.add("Dhanush", 200);
		System.out.println(s.getName()+" "+ s.getBill());
		
		
		Generics2<String,Double> s1 = new Generics2<String,Double>();
		s1.add("Dhanush", 344.61d);
		System.out.println(s1.getName()+" "+ s1.getBill());
		
		
	}
}
