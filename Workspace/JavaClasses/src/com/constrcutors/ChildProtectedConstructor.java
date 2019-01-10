package com.constrcutors;

public class ChildProtectedConstructor extends ParentProtectedConstructor{

	public static void main(String[] args) {
		
		ParentProtectedConstructor obj = new ParentProtectedConstructor();
		ChildProtectedConstructor obj1 = new ChildProtectedConstructor();
		//ChildProtectedConstructor obj2 = new ChildProtectedConstructor(10);
		obj.paretM1();
	}
	
	public ChildProtectedConstructor(){
		super();
		//this(10);
	}
	
	//For below constructor complier will check,  as user doesn't declare this or super, compiler will default added super() as first line
	//internally, thats why super class constructor will execute
	public ChildProtectedConstructor(int i){
		System.out.println(i);
	}

}
