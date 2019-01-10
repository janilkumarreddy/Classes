package com.abstractClass;

public class AbstractClassDemo {

	public static void main(String[] args) {
		
		ICICI obj1 = new ICICI(10,20,"JAK",32);
		obj1.deposite();
		obj1.withdraw();
		obj1.interest();
		
		HDFC obj2 = new HDFC(20,30);
		obj2.deposite();
		obj2.withdraw();
		obj2.interest();

	}

}
