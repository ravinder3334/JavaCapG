package com.capg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {
	public static void main(String[] args) {
		
		// 1st way
		Pattern p = Pattern.compile("....t",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("MohiT");
		boolean res=m.matches();
//		System.out.println(res);
		
		// 2nd way 
		boolean res2 = Pattern.compile("....t").matcher("Rohit").matches();
//		System.out.println(res2);
		
//		3rd way
		boolean res3 = Pattern.matches("....t", "###$t");
//		System.out.println(res3);
		
//		Regex Character classes
		
//		[abcd] represents single character, either a or b or c or d
//		System.out.println(Pattern.matches("[abcd]", "dc"));
		
//		[^abcd] represents single character, not one of them
//		System.out.println(Pattern.matches("[^pqr]", "q"));
		
//		[c-m] single character and it should be within c and m
//		System.out.println(Pattern.matches("[c-m]", "m"));
		
//		[c-mC-M] single character and it should be within c to m or C to M
//		System.out.println(Pattern.matches("[a-zA-Z0-9]", "7"));
		
//		Regex Quantifiers
//		[ac]+ one of the characters atleast occur once, any combination of a and c. 
//		System.out.println(Pattern.matches("[abc]+", "")); // ac,aaac,caacaca
		
//		[ac]* one of the characters atleast occur once or not at all, any combination of a and c
//		System.out.println(Pattern.matches("[pqr]*", "")); // ppprqq, qppr
		
//		[abc]{n} n characters consisting of a ,b and c
//		System.out.println(Pattern.matches("[abc]{3}", "baab"));
		
//		[pq]{n,} n or more characters consisting of p and q
//		System.out.println(Pattern.matches("[pq]{2,}", ""));
		
//		System.out.println(Pattern.matches("[pq]*{2}", "p"));
		
//		Regex MetaCharacters
//		\d single digit, short of [0-9]
//		System.out.println(Pattern.matches("\\d", "0")); 
		
//		\D non digit,short of [^0-9]
//		System.out.println(Pattern.matches("\\D", "9"));
		
//		\\s single space
//		System.out.println(Pattern.matches("\\s", " "));
		
//		\\w [a-zA-Z0-9]
//		System.out.println(Pattern.matches("\\w", "9"));
		
//		Regular Expression that accepts only 10 digit numeric characters starting with 7, 8 or 9
		
//		System.out.println(Pattern.matches("[789][0-9]{9}", "7123456789"));
		
//		System.out.println(Pattern.matches("[789]\\d{9}", ""));
		
		
	}
}
