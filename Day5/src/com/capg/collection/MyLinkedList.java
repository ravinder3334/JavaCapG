package com.capg.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList<String> li =  new LinkedList<String>();
		li.add("Shyam");
		li.add("Rohan");
		
		Iterator<String> itr = li.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		addFirst() 	addLast()	getFirst() 	getLast() removeFirst() removeLast()
 	}
}
