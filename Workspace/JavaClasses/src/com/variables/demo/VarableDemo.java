package com.variables.demo;

public class VarableDemo {

	public static void main(String[] args) {
	
		VDemo1 obj = new VDemo1();
		System.out.println(obj.publicVarA);
		System.out.println(obj.publicVarB);		
		System.out.println(VDemo1.c);
		System.out.println(obj.protectedVar);
		
		VDemo1.c = 200;
		obj.publicVarA=0;
		obj.publicVarB=0;
		
		VDemo1 obj1 = new VDemo1();
		System.out.println(obj1.publicVarA); //10
		System.out.println(obj1.publicVarB);//20
		System.out.println(VDemo1.c);//200

	}

}
