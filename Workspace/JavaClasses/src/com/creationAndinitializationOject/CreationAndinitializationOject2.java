package com.creationAndinitializationOject;

public class CreationAndinitializationOject2{
	
	//1.new - keyword will use for object creation
	//Constructors - will use to initialize the object

	int age;
	String name;	
	
	CreationAndinitializationOject2(String name, int age){
		this.name = name;
		this.age = age;
	}


	public static void main(String args[]){

		CreationAndinitializationOject2 s1 = new CreationAndinitializationOject2("jak",32);

	}
}
