package com.Basics;

public class EnumClass {
	
	//enum is a apecial class that represents a group of constants
	
	EnumClass() {
		
	}
	
	enum weeks{
		SUNDAY,MONDAY,TUESDAY
	}

	public static void main(String[] args) {

		weeks week = weeks.MONDAY;
		System.out.println(week);

	}
}
