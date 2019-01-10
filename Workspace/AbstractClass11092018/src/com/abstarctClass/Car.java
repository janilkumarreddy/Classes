package com.abstarctClass;

//1.Can't instantiated the abstract class, but they can be subclassed.
//2.Abstract class can have constructor.
//3.If we can't create the object of abstract class what is the need of constructor?

//Ans : Code reusability, ex : explains below


public abstract class Car {
	
	String name;
	int price;
	String fuelType;
	
	public Car(String name, int price, String fuelType) {
		this.name = name;
		this.price = price;
		this.fuelType = fuelType;
				
		
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.fuelType);
	}

	public void m1() {
		System.out.println("Abstract classCar - m1");
	}
	
	public void m3() {
		System.out.println("Abstract classCar - m3");
	}
	
	public abstract void model();
	
	
	
	

}
