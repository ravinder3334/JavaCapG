package com.capg.work;

public class Area {

	public void areaOfSquare(int side) {
		System.out.println(side*side);
	}
	public static void main(String[] args) {
		
		int s=10;
		Area a= new Area();
		a.areaOfSquare(s);
	}
}
