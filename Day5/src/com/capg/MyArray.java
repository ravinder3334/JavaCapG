package com.capg;

import java.util.Scanner;

public class MyArray {
	
	public static void array(int ar[]) {
		
		for(int i: ar) {
			System.out.println(i);
		}
	}
	
	public static int[] get() {
		int arr[] = new int[] {2,5,1};
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] a;
		int[] ar;
		int arr[];

		arr = new int[3];
//		 0      1         2
//		1001	1002	1003

		arr[0] = 12;
		arr[1] = 45;
		arr[2] = 23;

		int[] a1 = new int[5]; // 0 null 0.0 
//		String method .length();
//		Object length
//		String str= new String("Hello");
		
//		System.out.println(a1.getClass());
//		System.out.println(str.getClass());
//		String []st =  new String[2];
		

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);

//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}

//		for (int i = 0; i < a2.length; i++) {
//			if (i == 2) {
//				System.out.println(a2[i]);
//			}
//		}

//		for(int i: a2) {
//			System.out.println(i);
//		}
		
		int a2[] = new int[] { 2, 4, 6, 1, 12 };
//		array(a2);
//		System.out.println(a2);
		
		int res[]=get();
		
//		for(int i: res) {
//			System.out.println(i);
//		}
		Scanner sc = new Scanner(System.in);
		int []arr4 = new int[3];
		for(int i=0; i<arr4.length; i++) {
			arr4[i]= sc.nextInt();
		}
		for(int i: arr4) {
			System.out.println(i);
		}
		

	}
}
