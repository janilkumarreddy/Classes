package com.arrays;

public class ArraysDemo2 {
	public static void main(String[] args) {		
		char[] chArray = {'A','B','c','D','E'};
		String[] strArray = {"Acasdfghjklwertyuiopdfghjkl","B","c","D","E"};
		
		for(int i = 0 ; i<chArray.length ; i++) {			
			System.out.println("Character array values : "+chArray[i]);
			
		}
		System.out.println();
		
		for(int i = 0 ; i<chArray.length ; i++) {			
			System.out.println("String array values : "+strArray[i]);
		}
		System.out.println();
		
		for(char arrElement : chArray) {//chArray[0] = 'A' -- chArray[1] = 'B'
			System.out.println("Character array values : "+arrElement);
			//1
			//1<chArray.length
		}
		
		
	}
}

