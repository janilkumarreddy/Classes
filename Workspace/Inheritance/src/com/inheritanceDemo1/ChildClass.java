package com.inheritanceDemo1;

import com.inherianceDem0.ParentClass1;

public class ChildClass extends ParentClass1{
	
	public ChildClass() {
		//super();
		super(30,"Anil");
		System.out.println("Child class constructor");
	}


	public void childM1() {
		System.out.println("I am in child class --> childM1");
	}
	
	public int overrideMethod() {
		System.out.println("method overriding child class");
		return 1;
	}
	
	public void overrideMethod1(int i) {
		System.out.println("method overriding1 child class");		
	}
	
	private void overrideMethod2(int i) {
		System.out.println("method overriding pprivate child class");
		
	}
	
	public static void main(String args[]) {
		
		ChildClass obj = new ChildClass();
		obj.childM1();		
		obj.parentM1();
		obj.parentM2();
		obj.overrideMethod();
		//obj.overrideMethod1(10);
		obj.overrideMethod2(10);
		
		ParentClass1 obj1 = new ChildClass();
		//obj1.childM1();		//child class method won't be available
		obj1.parentM1();
		obj1.parentM2();
		obj1.overrideMethod();
		
		
	}




}
