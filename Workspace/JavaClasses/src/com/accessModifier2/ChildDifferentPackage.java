package com.accessModifier2;

import com.accessModifier1.Parent;

public class ChildDifferentPackage extends Parent{
	
	ChildDifferentPackage(){
		
	}

	public static void main(String[] args) {
		ChildDifferentPackage obj = new ChildDifferentPackage();
		obj.m1();
		
		obj.m2();

	}

}
