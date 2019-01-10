package com.variables.demo;

public class VDemo1{

	//instance variables
	public int a =10,b=20,sum=0;
	static int c = 100; //static variable
	private static int x=10;
	
	int xx = 10;
	protected int yy=20;

	public static void main(String[] args) {
		VDemo1 obj = new VDemo1();
		obj.sum();
		obj.sub();
		obj.div();
		System.out.println(obj.a);
		System.out.println(c);
		
		print();
	}

	private void sum() {
		//Local variables
		int x = 50,y=50;
		
		
		System.out.println(x+y);
		System.out.println(a+b);
		
		System.out.println(x);
		
		System.out.println(c);
	}

	public void sub() {
		System.out.println(a-b);
	}

	public void div() {
		System.out.println(a/b);
	}
	
	public static void print() {
		System.out.println("Hi");
	}

}
