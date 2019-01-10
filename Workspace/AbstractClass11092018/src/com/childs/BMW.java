package com.childs;

import com.abstarctClass.Car;

public class BMW extends Car{

	
	
	String model;
	int gears;
	String engineType;
	
	
	public BMW(String name, int price, String fuelType, String model, int gears,String engineType) {
		super(name, price, fuelType);
		
		this.model= model;
		this.gears = gears;
		this.engineType = engineType;
		
	}

	@Override
	public void model() {
		System.out.println("drive model : "+model);
	}
	
	public static void main(String args[]) {
		BMW obj=new BMW("BMW",500000,"diesel","B10",6,"BT");
	}

}
