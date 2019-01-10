package com.variables.demo;

import com.constrcutors.ParentProtectedConstructor;

public class ChildClassForProtectedConsructor extends ParentProtectedConstructor{	
	
	
	
	public ChildClassForProtectedConsructor() {
		super();//calling parent class constructor
		
	}

	public static void main(String[] args) {
		//super();
		ChildClassForProtectedConsructor obj = new ChildClassForProtectedConsructor();
		obj.paretM1();
		obj.childM1();
		
		ParentProtectedConstructor obj1 = new ChildClassForProtectedConsructor();
		obj1.paretM1();
		obj1.c
	}
	
	public void childM1() {
		System.out.println("childM1");
	}

}
