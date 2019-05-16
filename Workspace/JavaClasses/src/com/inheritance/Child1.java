package com.inheritance;

public class Child1 extends Parent{
	
	public void m1() {
		System.out.println("Child m1");
	}
	
	public void m3() {
		System.out.println("Child m3");
	}
	
	
	public static void m4() {
		System.out.println("Child static m4");
	}
	
	
	public void add(int xInput) {
		int y  = 0;
		 y = xInput+1;
		 System.out.println(y);
	}
	
	public void add(int a, int b) {
		x = a+b;
		System.out.println("Child add : "+x);
	}
	
	
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.m1();//Parent
		p.m2();//Parent
		p.m5();	
		p.m4();
		//p.m3();
		p.add(1, 2);
		
		
		Child1 c = new Child1();
		c.m1();//Overriding method will get execute i..e.Child
		c.m2();//Parent
		c.m3();//Child
		c.m4();
		c.m5();
		//c.m6();		
		c.add(c.x);
		c.add(3, 2);
		
		//In Java, all non-static methods are based on the runtime type of the underlying object rather than the type of the reference
		//that points to that object. Therefore, it doesn’t matter which type you use in the declaration of the object,
		//the behavior will be the same.
		Parent p1 = new Child1();
		p1.m1();//Child//Overriding method will get execute
		p1.m2();//Parent
		//p1.m3();//Compile time error, as Parent doesn't have any m3() method
		p1.m5();
		p1.m4();
		p1.add(4, 2);
		//Child1 c = new Parent(); // Child reference type can't hold Parent object 
		
		
		
	}

}
