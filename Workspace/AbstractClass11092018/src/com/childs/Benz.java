package com.childs;

import com.abstarctClass.Car;

public class Benz extends Car{

	
	String model;
	int gears;
	String engineType;
	
	
	
	public Benz(String name, int price, String fuelType, String model, int gears,String engineType) {
		super(name, price,fuelType);
		
		
		
		this.model= model;
		this.gears = gears;
		this.engineType = engineType;
		
	}

	@Override
	public void model() {
		System.out.println("drive model : "+model);
	}
	
	public static void main(String args[]) {
		Benz obj=new Benz("BWNZ",500000,"petrol","B10",6,"BT");
	}

}
