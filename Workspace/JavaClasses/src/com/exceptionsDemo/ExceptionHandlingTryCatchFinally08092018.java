package com.exceptionsDemo;

public class ExceptionHandlingTryCatchFinally08092018 {

	public static void main(String[] args) {

		int x = 10;
		int y=0;
		int div = 0;

		int arr[] = {1,2,3,4,5};

		/*try {
			div = x/y;	//arithmetic Exception
			System.out.println(div);
		} catch (Exception e) {
			System.out.println(e.getMessage());

			try {
				System.out.println(arr[6]);
			} catch (Exception e1) {
				e1.printStackTrace();
			}//arrayIndexOutOfBound
		}*/


		//Multiple catch blocks
		/*try {
			div = x/y;	//arithmetic Exception
			System.out.println(div);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}	
		System.out.println(div);
*/

		//Multiple catch blocks
		/*try {
			div = x/y;	//arithmetic Exception
			System.out.println(div);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		System.out.println(div);*/
		
		
		//Finally block		
		/*try {
			div = x/y;	//arithmetic Exception
			System.out.println(div);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally block");
		}*/
		
		ExceptionHandlingTryCatchFinally08092018 obj = new ExceptionHandlingTryCatchFinally08092018();
		obj.m1();
		obj.m3();
	}
	
	/*Normal method wih return type
	 * public int m2() {
		int x = 10;
		System.out.println(x);
		return x;
	}*/
	
	
	//Finally block always execues irrespective of return statement in try or catch blocks
	public int m1() {
		int i = 0;		
		try {
			System.out.println("In try block : "+i);
			//int x=i/0;
			return i;
		}catch(Exception e) {
			System.out.println("In catch block : "+i);
			return i;
		}finally {
			System.out.println("in finally block");
		}			
	}
	
	//Situation of nt executing finally block
	public void m3() {
		try {
			System.out.println("In try block");
			System.exit(1);
		}catch(Exception e) {
			System.out.println("In catch block");
		}finally {
			System.out.println("in finally block");
		}	
	}

}
