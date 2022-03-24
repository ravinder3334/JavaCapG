package com.capg.work;

public class Person2 {
	public static void main(String[] args) {
		String s="Aman is working";
		char[] c = {'A','m','a','n'};
		String s1= new String(c);
		String s3 = new String ("Aman");
//		s = s.concat(" Sharma");
//		System.out.println(s.concat(" Sharma"));
//		s.concat(" Sharma");
//		
//		System.out.println(s);
//		System.out.println(s.contains("n"));
//		System.out.println(s.endsWith("ing"));
//		System.out.println(s.startsWith("am"));
//		System.out.println(s.length());
//		System.out.println(s.substring(5));
//		System.out.println(s.charAt(3));
//		System.out.println(s1.compareTo(s3)); // s=15 , s1=4
//		System.out.println(s.trim());
//		System.out.println(s.replace('i', 't'));
//		System.out.println(s1.equals(s3));
		
//		int a = 10;
//		String d = String.valueOf(a);
//		System.out.println(d);
		
//		s.concat(" Sharma");
//		System.out.println(s);
		
		StringBuffer sb = new StringBuffer(s); // Thread Safe
//		sb.append(" Sharma");
//		sb.reverse();
		System.out.println(sb);
		
//		StringBuilder sbuilder = new StringBuilder(s); // Not Thread Safe
//		sbuilder.append(" Sharma");
//		System.out.println(sbuilder);
	}
}
