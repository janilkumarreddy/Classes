package com.constrcutors;

import java.sql.Connection;

//private constructors
//default constructors
//protected constructors

public class ConstructorClass {
	
	int x = 0,y = 0;
	Connection con= null;
	
	public ConstructorClass() {
		System.out.println("Noargument constructor");
		print();
		fn_Sum();
	}
	
	public ConstructorClass(int a, int b) {
		x=a;
		y=b;
		System.out.println(x +" "+y);	
		
	}
	
	public ConstructorClass(String name, int b) {
		System.out.println(name);
		y=b;
		System.out.println(x);	
		System.out.println(y);
	}
	
	
	public ConstructorClass(int a, int b, String name) {
		x=a;
		y=b;
		System.out.println(x +" "+y);		
	}

	public static void main(String[] args) {
	
		ConstructorClass obj_ConstructorClass = new ConstructorClass();				
		//ConstructorClass obj_ConstructorClass2 = new ConstructorClass("JAK",20);
		//ConstructorClass obj_ConstructorClass1 = new ConstructorClass(10,20);
		
		obj_ConstructorClass.fn_Sum();
		
		//PrivateConstructor obj = new PrivateConstructor();
	}
	
	
	public  void fn_Sum() {		
		System.out.println(10+20);
	}
	
	public void print() {
		System.out.println("I am calling from construtor");
	}

}
