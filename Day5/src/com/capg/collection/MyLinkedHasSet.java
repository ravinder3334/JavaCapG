package com.capg.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MyLinkedHasSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> hs= new LinkedHashSet<Integer>();
		hs.add(12);
		hs.add(45);
		hs.add(1);
		hs.add(23);
		hs.add(45);
		LinkedHashSet<String> hs1 = new LinkedHashSet<String>();
		hs1.add("Rohan");
		hs1.add("Shyam");
		hs1.add(null);
		
		for( String i : hs1) {
			System.out.println(i);
		}
	}
}
