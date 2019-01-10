package com.interfaceDemo;


//1.All variables are public static final even though if we declare r not
//2.Will not have constructor and we can't create object for interface
//3.Can declare default and static methods from java 1.8
//4.static method is visible to interfaces methods only. Like other static methods we can use interface static methods using interface name.
public interface InterfaceDemo {
	
	int age=0;//public static final int age = 0;
	String name = "jak";
	
	
	//Normal method
	public void demo();
	
	public default  void m1() {
		System.out.println("Default Method m1");
	};
	
	public default void m2() {
		System.out.println("Default Method m2");
		m3();
	};
	
	public static void m3() {
		System.out.println("Static method m3");
	}
	
	//public default void m4();

}
