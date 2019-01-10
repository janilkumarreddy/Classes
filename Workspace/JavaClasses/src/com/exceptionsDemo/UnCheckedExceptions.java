package com.exceptionsDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UnCheckedExceptions {
	
	
	//1.Checked Exceptions or Compile Time Exceptions
	//2.Unchecked Exceptions or Runtime Exceptions
	//Errors
	
	public static void main(String[] args) {		
		
		//ArrayIndexOutOfBound Exception
		//int arr[] = {1,2,3,4,5};		
		//System.out.println(arr[6]);
		
		
		//Airthmetic Exception
		//int x=10;
		//int y=0;		
		//int div = x/y;
		
		//NullPointerException
		//IllegalStateException
		//ClassCastException
		
		Object i = Integer.valueOf(10);
		String s = (String)i;
		
		
	}
	

}
