package com.variables.demo;

public class VDemo1{

	//instance variables
	int deafultVarXX = 10;
	public int publicVarA =10,publicVarB=20,publicVarSum=0;	
	private int privateVar = 100;
	protected int protectedVar=20;
	
	static int c = 100; //static variable
	private static int x=10;
	
	
	

	public static void main(String[] args) {
		VDemo1 obj = new VDemo1();
		obj.sum();
		obj.sub();
		obj.div();
		System.out.println(obj.publicVarA);
		System.out.println(c);
		obj.
		print();
	}

	private void sum() {
		//Local variables
		int x = 50,y=50;
		
		
		System.out.println(x+y);
		System.out.println(publicVarA+publicVarB);
		
		System.out.println(x);
		
		System.out.println(c);
	}

	public void sub() {
		System.out.println(publicVarA-publicVarB);
	}

	public void div() {
		System.out.println(publicVarA/publicVarB);
	}
	
	public static void print() {
		System.out.println("Hi");
	}

}
