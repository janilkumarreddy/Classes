package com.methodOverLoading;

public class methodOverLoadingDemo {
	
	//1.Methd overloading will happen in same class	
	//2.Method name should be same
	//3.No.of Arguments should be different
	//4.If no.of arguments are same, arguments type should be different and order of declaration should be different
	//5.method overloading can't be performed by just changing the return type of the method.
		//return type can be same or different, but arguments should be different
		
		public void m1() {
			System.out.println("method m1");
		}
		
		public void m1(int i) {
			System.out.println("method m1");
		}
		
		public void m1(String i) {
			System.out.println("method m1");
		}
		
		public String m1(String i,int j) {
			System.out.println("method m1");
			
			return "JAK";
		}
		
		public String m1(int i,String j) {
			System.out.println("method m1");
			
			return "JAK";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
