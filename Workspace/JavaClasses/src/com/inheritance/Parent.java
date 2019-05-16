package com.inheritance;

public class Parent {
	
	//Code Reusability
	//Maintainability
	
	//1.Single Level Inheritance
	//2.MultiLevel
	//3.Hierarchical
	//4.Hybrid
	//5.Multiple // java will not support multiple inheritance
	
	int x = 10;
	
	public void m1() {
		System.out.println("PArent m1");
	}
	
	public void m2() {
		System.out.println("PArent m2");
	}
	
	public static void m4() {
		System.out.println("PArent static m4");
	}
	
	void m5() {
		System.out.println("parent m5");
	}
	
	public void add(int a, int b) {
		x = a+b;
		System.out.println("Parent add : "+x);
	}
	
	

}
