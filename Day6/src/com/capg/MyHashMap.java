package com.capg;


import java.lang.System.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;

public class MyHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Rohan");
		map.put(2, "Ram");
		map.put(3, "Shyam");
//		for( Map.Entry<Integer, String> m : map.entrySet()) {
//			System.out.println(m.getKey()+ " " + m.getValue());
//		}
		 System.out.println(MyHashMap.class);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
//		while(itr.hasNext()) {
//			Map.Entry<Integer, String> m = (Entry<Integer, String>) itr.next();
//			System.out.println(m.getKey() + " " + m.getValue());
//		}
		
		
		
		
	}
}
