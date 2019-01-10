package com.exceptionsDemo;

import java.io.File;
import java.io.FileNotFoundException;

public class ThrowThrows09092018 {

	//throws : 1.declared at method signature. 2. multiple exceptions we can throws
	//throw : in side method or static block. 2.Single Exception throw

	public static void main(String[] args) {
		ThrowThrows09092018 obj = new  ThrowThrows09092018();
		try {
			obj.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		obj.write();
		System.out.println("in main");

	}

	public void read() throws FileNotFoundException{
		File file = new File("D://text.txt");
		//Read file operations code
		//
		//
		//
	}

	public void write() throws FileNotFoundException,ArithmeticException  {
		System.out.println("write method");
		//try {
			throw new FileNotFoundException("File not Found Exception");
		/*} catch (FileNotFoundException e) {
			System.out.println("in write");
		}*/
	}

}
