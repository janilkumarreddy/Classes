package com.arrays;
import java.util.Arrays;

public class ArraySortProgramatically {

	public static void main(String[] args) {
		int a[] = {59,10,45,56,0,2,4};
		
		int temp;
		System.out.println(Arrays.toString(a));
		for(int i=0 ; i < a.length;i++) {			
			for(int j=1;j<(a.length-i) ; j++) {				
				if(a[j-1] > a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j]=temp;
				}
				System.out.println(Arrays.toString(a));
			}	
		}
		System.out.println(Arrays.toString(a));

	}
	
	

}
