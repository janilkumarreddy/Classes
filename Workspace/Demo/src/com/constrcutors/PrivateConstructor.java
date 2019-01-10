package com.constrcutors;

public class PrivateConstructor {

	private PrivateConstructor() {
		System.out.println("private constructor");
	}


	public void m1() {
		System.out.println("m1");
	}


	public static void main(String args[]) {
		PrivateConstructor obj1 = new PrivateConstructor();
		obj1.m1();
	}


}
