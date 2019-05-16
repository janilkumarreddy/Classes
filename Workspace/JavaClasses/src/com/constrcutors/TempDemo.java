package com.constrcutors;

public class TempDemo {
	
	TempDemo(){
		System.out.println("DEfault");
	}
	
	TempDemo(String name){
		System.out.println(name);
	}	
	
	TempDemo(int x){
		System.out.println(x);
	}
	public static void main(String[] args) {
		
		TempDemo obj = new TempDemo();
		TempDemo obj1 = new TempDemo("RAVIs");
		

	}
	
	public void m1(float f) {
		System.out.println("method m1");
	}
	
	public void m1(double d) {
		System.out.println("method m1");
	}
	
	public void m1(double d,int x,int y,String name) {
		System.out.println("method m1");
	}
	
	public void m1(double d,int x,String name,int y) {
		System.out.println("method m1");
	}

}
