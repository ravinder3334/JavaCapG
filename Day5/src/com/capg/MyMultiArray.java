package com.capg;

import java.util.Scanner;

public class MyMultiArray {

	public static void main(String[] args) {
		int[][] a;
		int [][]a1;
		int a2[][];
		int []a3[];
		
//		[Row][Column];
//		[horizontal][vertical]
		
//		5	6
//		00	01
		
//		2	1
//		10	11
		
		
		
		int [][]arr = new int[2][2];
		arr[0][0]=5;
		arr[0][1]=6;
		arr[1][0]=2;
		arr[1][1]=1;
		
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

//		for(int[] i: arr) {
//			for(int el: i) {
//				System.out.println(el);
//			}
//			
//		}
	}
}
