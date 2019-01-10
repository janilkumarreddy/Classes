package com.Overriding;

import com.inheritance.Child1;
import com.Overriding.Parent;

public class OverRidingDemo extends Parent{
	
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
		
		
		OverRidingDemo c = new OverRidingDemo();
		c.m1();//Overriding method will get execute i..e.Child
		c.m2();//Parent
		c.m3();//Child
		
		Parent p1 = new OverRidingDemo();
		p1.m1();//Parent
		p1.m2();//Child
			
	}

}
