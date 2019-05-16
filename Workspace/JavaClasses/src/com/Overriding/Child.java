package com.Overriding;

import com.inheritance.Child1;
import com.Overriding.Parent;

public class Child extends Parent{

	public static void m1() {
		System.out.println("child static m1");
	}

	public void m2() {
		System.out.println("child non-static m2");
	}

	public void m3() {
		System.out.println("Child m3");
	}


	public static void main(String[] args) {

		Parent p = new Parent();
		p.m1();//Parent
		p.m2();//Parent
		

		Child c = new Child();
		c.m1();//Overriding method will get execute i..e.Child
		c.m2();//Child
		c.m3();//Child

		//In Java, all non-static methods are based on the runtime type of the underlying object rather than the type of the reference
		//that points to that object. Therefore, it doesn’t matter which type you use in the declaration of the object,
		//the behavior will be the same.
		Parent p1 = new Child();
		p1.m1();//Parent
		p1.m2();//Child
		
		
		//OverRidingDemo c1 = new Parent();

	}
	
	

}
