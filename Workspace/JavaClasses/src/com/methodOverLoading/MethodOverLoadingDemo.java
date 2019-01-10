package com.methodOverLoading;

public class MethodOverLoadingDemo {
	
	//MethodSignature = MEthodName+arguments
	
	//1.Method overloading will happen in same class	
	//2.Method name should be same
	//3.No.of Arguments should be different
	//4.If no.of arguments are same, arguments type should be different and order of declaration should be different
	//5.method overloading can't be performed by just changing the return type of the method.
		//return type can be same or different, but arguments should be different
		
		public void m1() {
			System.out.println("method m1");
		}
		
		public void m1(int i) {
			System.out.println("method int m1");
		}
		
		public void m1(String i) {
			System.out.println("method String m1");
		}
		
		public String m1(String i,int j) {
			System.out.println("method String,int m1");
			
			return i;
		}
		
		public String m1(int i,String j) {
			System.out.println("method int,Sring m1");
			
			return j;
		}

	public static void main(String[] args) {
		MethodOverLoadingDemo obj = new MethodOverLoadingDemo();
		obj.m1();
		obj.m1(10);
		obj.m1("JAK");
		obj.m1(10, "JAK");
		obj.m1("JAK", 10);
		
		obj.m1('a');//complier will do automatic Type promotion, hence int argument method wil execute
		
		//char --> int --> long --> float --> double
		//byte --> short --> int --> long --> float --> double
	}

}
