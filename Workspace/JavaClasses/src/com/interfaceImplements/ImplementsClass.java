package com.interfaceImplements;

import com.interfaceDemo.InterfaceDemo;

public class ImplementsClass implements InterfaceDemo{

	public static void main(String[] args) {
		ImplementsClass obj = new ImplementsClass();
		obj.demo();
		
		obj.m1();
		obj.m2();
		obj.m3();
	
		InterfaceDemo.m3();
		
		
		System.out.println(obj.age);
		System.out.println(obj.name);
		
		
		System.out.println(InterfaceDemo.age);
		System.out.println(InterfaceDemo.name);
	}

	@Override
	public void demo() {
		System.out.println("over ride method of interface in child class");		
	}
	
	@Override
	public void m1() {
		System.out.println("Overridden in Method m1");
	};
	
	//@Override
	public void m3() {
		System.out.println("method m3 in child class");
	}
	
	

}
