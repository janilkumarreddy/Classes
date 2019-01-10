package com.inheritance;

public class Child1 extends Parent{
	
	public void m1() {
		System.out.println("Child m1");
	}
	
	public void m3() {
		System.out.println("Child m3");
	}
	
	
	public void m4() {
		System.out.println("Child m4");
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.m1();//Parent
		p.m2();//Parent
		
		
		Child1 c = new Child1();
		c.m1();//Overriding method will get execute i..e.Child
		c.m2();//Parent
		c.m3();//Child
		
		Parent p1 = new Child1();
		p1.m1();//Child//Overriding method will get execute
		p1.m2();//Parent
		//p1.m3();//Compile time error, asParent doesn't have any m3() method
		
		//Child1 c = new Parent(); // Child reference type can't hold Parent object 
		
		
		
	}

}
