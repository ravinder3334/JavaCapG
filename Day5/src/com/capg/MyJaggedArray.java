package com.capg;

public class MyJaggedArray {

	public static void main(String[] args) {
//		Array with different number of columns
//		12	34
//		00  01
		
//		1
//		10
		
//		20	12	34
//		20  21  22
		int arr[][] = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}
}
