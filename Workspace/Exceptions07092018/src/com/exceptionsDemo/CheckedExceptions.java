package com.exceptionsDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {
	
	
	//1.Checked Exceptions or Compile Time Exceptions
	//2.Unchecked Exceptions or Runtime Exceptions
	//Errors

	//IOException
	//ClassNotFoundException
	
	public static void main(String[] args) {		
		CheckedExceptions obj = new CheckedExceptions();
		obj.readFile();		
	}
	
	//Checked Exception
	public void readFile() {
		File file = new File("E://file.txt");
		FileReader fr = new FileReader(file);
		
		/*try {
			FileReader fr = new FileReader(file);
			System.out.println("File Found");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found : "+e.getMessage());
		}*/		
	}
	
	public void m1() {
		/*try {
			readFile();
		} catch (FileNotFoundException e) {
			System.out.println(" Handled Exception");
		}*/
	}
	
	
	//Unchecked Exception

}
