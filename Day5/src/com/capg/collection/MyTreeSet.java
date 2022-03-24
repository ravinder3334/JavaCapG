package com.capg.collection;

import java.util.TreeSet;

public class MyTreeSet {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Ram");
		ts.add("Aman");
		ts.add("Shyam");
		ts.add("Barun");
		ts.add(null);
		
		for(String st: ts) {
			System.out.println(st);
		}
	}
}
