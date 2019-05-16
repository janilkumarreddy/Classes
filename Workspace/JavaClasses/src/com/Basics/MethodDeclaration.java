package com.Basics;

public class MethodDeclaration {
	
	int z;//0

	public static void main(String[] args) {
		
		MethodDeclaration obj = new MethodDeclaration();
		//obj.addNumbers(10, 20);//30
		obj.mulNumbers(10, 20);
	}
	
	
	
	
	public int addNumbers(int x,int y) {	
		z = x+y;	
		System.out.println(z);
		
		return z;
	}

	public void mulNumbers(int x, int y) {
		
		int mul;//0		
		mul = addNumbers(x,y) * 10;
		System.out.println(mul);
		
	}

	
}
