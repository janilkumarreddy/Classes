package com.methodOverLoading;

public class DifferentCasesOfOverLoading {

	public static void main(String... args) {//String args;
		
		DifferentCasesOfOverLoading obj= new DifferentCasesOfOverLoading();
		Test t = obj.new Test();
		
		
		//Case 1 - Automatic Type promotion in overloading
		//If exact argument type is not found, compiler will do automatic type promotion and then will check whether matched methos is avialable or not.
		//If matched method is available it will be considered and if matched methods is not available then compiler promots argument to the next level.
		//This process will be continued until all possible promotions. Still if the matched methods is not available then compiler will raise compile time error
		t.m1(10);//10.0f
		t.m1('A');
		//Type Promotion :- 
		//char --> int --> long --> float --> double
		//byte --> short --> int --> long --> float --> double
		
		
		//Case 2
		Test1 t1 = obj.new Test1();
		t1.m1(new Object());//Object version
		t1.m1("JAK");//String version
		t1.m1(null);//String version (While resolving overloaded methods, compiler will always give the precedence for child type argument when compared with parent type argument]
		//As String is child of Object[parent] class in above context, so String version will execute  
		
		
		Test2 t2 = obj.new Test2();
		t2.m1("JAK");//String version
		t2.m1(new StringBuffer("JAK"));//StringBuffer version
		t2.m1(null);//will get compile time error as "reference to m1() is ambiguous"
		//Reason for above compile error is - As String and StringBuffer both are at same level [Parent class of both String and StringBuffer is Object] which extends Object class.
		//Hence compiler can't decide in this situation, hence it will throw the compile time error.
		
		Test3 t3 = obj.new Test3();
		t3.m1(10, 10.5f);//int.float
		t3.m1(10.5f, 10);
		//t3.m1(10, 10); // ambiguous error, [event though first argument match with int argument of "m1(int,float)" method and there is chance of second argument promotes to float - compiler will throw ambiguous error,
		//because we considered arguments from left to right, if few countries may treat them right to left. So problem will arise.
		//As java platform independent and not a country/region dependent, to make unique compiler will throw the error.
		//Note: if code doesn't have m1(float,int) overloaded method the above problem will not arise.
//		t3.m1(10.5f, 10.5f);//compile time error
		
		
		
		Test4 t4 = obj.new Test4();
		t4.m1();//var-arg method - As var-arg method will match for zero or more arguments
		t4.m1(10,20,30,40);//var-arg method
		t4.m1(10);//Single argument method [ Because general method concept came in 1.0 version of java, var-arg concept came in 1.5 version of java, to make support/compatability preference always go to old versions only]
		//In general Var-arg method will get least priority.i.e. if no other method matched then only var-arg method will get chance.  
	}
	
	
	class Test{
		public void m1(int i) {
			System.out.println(i);
		}
		
		public void m1(float f) {
			System.out.println(f);
		}
		
		public void m1(double d) {
			System.out.println(d);
		}		
	}
	
	class Test1{
		public void m1(String str) {
			System.out.println("String version");
		}
		
		public void m1(Object obj) {
			System.out.println("object version");
		}
	}
	
	class Test2{
		public void m1(String str) {
			System.out.println("String version");
		}
		
		public void m1(StringBuffer obj) {
			System.out.println("StringBuffer version");
		}
	}
	
	class Test3{
		public void m1(int i, float f) {
			System.out.println("int-float version");
		}
		
		public void m1(float f, int i) {
			System.out.println("float-int version");
		}
	}
	
	class Test4{
		public void m1(int i) {
			System.out.println("single argument method");
		}
		
		public void m1(int... i) {
			System.out.println("var-arg method");
		}
	}

}
