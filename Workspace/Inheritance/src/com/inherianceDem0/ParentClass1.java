package com.inherianceDem0;

public class ParentClass1 {
	
	int age = 30;
	String name = "jak";
	
	private String java = "java";
	
	
	/*public ParentClass1() {
		System.out.println("Parent class1 constuctor");
	}*/
	
	public ParentClass1(int age,String name) {
		
		this.age = age;
		this.name = name;
		System.out.println(age+" "+name);
	}
	
	public void parentM1() {
		System.out.println("I am in parentM1 and my name is : "+name+" having aga of : "+age);
	}
	
	public void parentM2() {
		System.out.println("I am in parentM2 and my name is : "+name+" having aga of : "+age);
	}
	
	public int overrideMethod() {
		System.out.println("method overridingparent class");
		return 1;
	}
	
	public void overrideMethod1(int i) {
		System.out.println("method overriding1 parent class");
		
	}
	
	private void overrideMethod2(int i) {
		System.out.println("method overriding pprivate parent class");
		
	}

}
