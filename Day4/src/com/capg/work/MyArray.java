package com.capg.work;

// bits/std++.h

import java.util.*;
import java.util.Scanner;

public class MyArray {
	public static void main(String[] args) {
		
//		float arr[] = new float[5];
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<arr.length;i++) 
//		{
//			arr[i]=sc.nextFloat();
//		}
//		for(float a: arr) {
//			System.out.println(a);
//		}
		float arr[]= {12,4,16,7,23,5};
		
		Arrays.sort(arr);
		// 4.0 5.0 7.0 12.0 16.0 23.0
			
		System.out.println(Arrays.binarySearch(arr,12)+1);
//		for(float a: arr) {
//			System.out.println(a);
//		}
 	}

}
