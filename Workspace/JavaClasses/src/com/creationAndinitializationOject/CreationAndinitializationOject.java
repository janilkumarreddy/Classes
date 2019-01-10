package com.creationAndinitializationOject;

public class CreationAndinitializationOject{
	
	//1.new - keyword will use for object creation
	//Constructors - will use to initialize the object

	int age;
	String name;	
	
	CreationAndinitializationOject(String name, int age){
		this.name = name;
		this.age = age;
	}


	public static void main(String args[]){

		CreationAndinitializationOject s1 = new CreationAndinitializationOject("jak",32);

	}
}
