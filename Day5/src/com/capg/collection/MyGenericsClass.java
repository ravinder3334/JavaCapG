package com.capg.collection;

class MyGenerics<T>{
	T obj;
	
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return obj;
	}
}

public class MyGenericsClass {
	public static void main(String[] args) {
		MyGenerics<Integer> m = new MyGenerics<Integer>();
		m.add(13);
		System.out.println(m.get());
		
		MyGenerics<String> s = new MyGenerics<String>();
		s.add("Rohan");
		System.out.println(s.get());
	}
}
