package com.returnType;

public class ReturnTypeDemo {
	
	public void m1() {
		System.out.println("method m1");
	}
	
	public int add(int a, int b) {
		int c = 0;		
		c  = a+b;
		
		return c;
	}
	
	
	public void print(int x) {
		System.out.println("After adding sum is : "+x);
	}
	
	public static void main(String... args) {
		
		ReturnTypeDemo obj = new ReturnTypeDemo();
		
		//int i = obj.m1();
		obj.m1();
		
		int sum = obj.add(10,20);
		
		obj.print(sum);
		
		
	}
}
