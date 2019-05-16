package com.arrays;

public class MultiDimensionArray {

	//Multidimension arrays are actually arrays of arrays



	public static void main(String[] args) {

		int x = 0; 

		int arrTwo[][] = new int[3][2];

		System.out.println("Length of Array : "+arrTwo.length);

		//Assigning values to two dimension arrays
		for(int i=0 ; i<arrTwo.length ; i++) {			
			System.out.println(arrTwo[i].length);			
			for(int j=0; j < arrTwo[i].length ; j++) {
				arrTwo[i][j] = x +10;
				x = x+10;
			}			
		}

		//printing values to two dimension arrays
		for(int i=0 ; i<arrTwo.length ; i++) {			
			System.out.println(arrTwo[i].length);			
			for(int j=0; j < arrTwo[i].length ; j++) {
				System.out.println("arrTwo["+i+"]["+j+"] : " +arrTwo[i][j]);
			}			
		}
		
		 String[][] names = {
		            {"Mr. ", "Mrs. ", "Ms. "},
		            {"Smith", "Jones"}
		        };
		        // Mr. Smith
		        System.out.println(names[0][0] + names[1][0]);
		        // Ms. Jones
		        System.out.println(names[0][2] + names[1][1]);

	}

}
