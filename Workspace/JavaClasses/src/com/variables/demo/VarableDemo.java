package com.variables.demo;

public class VarableDemo {

	public static void main(String[] args) {
	
		VDemo1 obj = new VDemo1();
		System.out.println(obj.a);
		System.out.println(obj.b);		
		System.out.println(VDemo1.c);
		System.out.println(obj.yy);
		
		VDemo1.c = 200;
		obj.a=0;
		obj.b=0;
		
		VDemo1 obj1 = new VDemo1();
		System.out.println(obj1.a); //10
		System.out.println(obj1.b);//20
		System.out.println(VDemo1.c);//200

	}

}
