package com.capg.work;

public class Method {
	
	public void hello() {
		System.out.println("Hello");
	}
	
	public int add(int p, int q) { 
		int r=p+q;
		return r;
	}
	
	public void multiply(int a , int b, int c) {
		int d=a*b*c;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
//		int a=5;
//		int b =10;
//		
//		int c = a*b;
//		System.out.println(c);
//		
//		int d = 7;
//		int e= 9;
//		int f= d*e;
//		System.out.println(f);
//		int a = 10;
//		int b = 5;
//		
//		multiply(a,b);
//		Method method = new Method();
//		method.multiply(a,b);
//		
//		int c=10;
//		int d=30;
//		method.multiply(c, d);
		Method method= new Method();
//		method.multiply(5, 2, 3);
//		method.hello();
		
//		int a= method.add(10, 30);
//		System.out.println(a);
		System.out.println(method.add(10, 20));
	}
}
