package com.finalfinallyfinalize.demo;

public class FinallyClass {
	
	static int i = 10;

	public static void main(String[] args) {

		try {			
			int j = i /0;
			System.out.println("j value : "+j);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally");
		}
	}

}
