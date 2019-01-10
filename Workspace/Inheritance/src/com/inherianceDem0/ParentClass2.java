package com.inherianceDem0;

public class ParentClass2 {
	
	public static void main(String arg[]) {
		
		String names[] = {"sharat","anil","cnu","yadav"};
		
		for(int i=0 ; i <= names.length-1 ; i++) {
			System.out.println(names[i]);
		}
		
		for(String i : names) {
			System.out.println(i);
		}
		
	}

}
