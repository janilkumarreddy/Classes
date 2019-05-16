package com.arrays;
import java.util.Arrays;

public class ArraysClassDemo {

	public static void main(String[] args) {
		
		int a[] = {10,59,45,56,0,2,4,9,7};
		int b[] = {58,9,6,5,48,7};
		int c[] = {58,9,6,5,48,7};
		int d[] = {58,9,6,5,48,8};
		
		int e[] = null;
		int f[] = null;
		String arr[] = null;		
		
		//Before using binary search,we have call sort the array first, otherwise non gaurentee on bindarysearch output
		Arrays.sort(a);
		//Arrays.sort(a,3,7);
		System.out.println(Arrays.toString(a));		
		
		int index = Arrays.binarySearch(a, 45);
		System.out.println("Index of 45 : "+index);
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(c, d));		
		System.out.println(Arrays.equals(e, f));//Two null arrays will return true
		//System.out.println(Arrays.equals(e, arr));//		
		
		Arrays.sort(b, 2, b.length);
		System.out.println(Arrays.toString(b));
		
		//ArrayIndexOutOfBound Exception
		try {
			Arrays.sort(b, 2, 10);
			System.out.println(Arrays.toString(b));
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		
		//IllegalArgumentException
		Arrays.sort(b, 5, 2);
		System.out.println(Arrays.toString(b));
		
		
		
	}

}
