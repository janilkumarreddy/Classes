package com.accessModifier1;


public class Parent {

	private int x = 10;
	
	protected void m1() {
		System.out.println("Protected method");
	}
	
	public void m2() {
		System.out.println("public method");
	}
	
	private void m3() {
		System.out.println("private method");
	}
	
	void m4() {
		System.out.println("default method");
	}

}