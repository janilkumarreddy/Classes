package com.abstractClass;

/**
 * 1. Can we create the object for Abstract Class?
 * Ans : No
 * 2.Why can't we create object for Abstract class?
 * Ans : As abstract class having unimplemented methods.
 * 3.Is Abstract class can have constructor?
 * Ans : yes
 * 4.We can't create the object of Abstract class, then what is the need of constructor?
 * Ans : To initial the abstract class instance variables
 *
 */

abstract class BankAbstractClass {
	
	int i;
	int j;
	
	public BankAbstractClass(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public void deposite() {
		System.out.println("deposite method");
	}
	
	public void withdraw() {
		System.out.println("withdraw method");
	}
	
	public abstract void interest();

}


class ICICI extends BankAbstractClass{ 
	
	String name;
	int age;
	
	public ICICI(int i, int j, String name,int age) {
		super(i,j);
		this.name = name;
		this.age = age;
		
		
	}

	@Override
	public void interest() {
		System.out.println("ICICI interest");		
	}
	
}

class HDFC extends BankAbstractClass{
	
	public HDFC(int i, int j) {
		super(i,j);
	}

	@Override
	public void interest() {
		System.out.println("HDFC interest");		
	}
	
}


