package com.interfaceDemo;

public interface InterfaceDemo1 {
	
	int i=10;
	//public static final int i = 10;
	
	public void m1();
	
	public void m5();
	
	//public void m6();
	
	//public abstract void m1();
	
	
	//From java 8
	public default void m2() {
		
	}
	
	
	public static void m3() {
		
	}
	
	
	class A implements InterfaceDemo1{

		@Override
		public void m1() {
			System.out.println("Child implementation");
		}

		@Override
		public void m5() {
			System.out.println("Child implementation");
		}
		
		
	}
	

}
