package com.StringSringBufferSringBuilder.Demo;

public class StringSringBufferSringBuilderDemo {
	
	
	//String - Immutable
	//StringBuffer(all methods Sychronized - slow performance comapre to builder) and StringBuilder (All methods are non-synchronized - fast performance) - Mutable
	
	

	String str = "abc";
	String str2 = new String("efg");

	// is equivalent to: 

	char data[] = {'a', 'b', 'c'};
	String str1 = new String(data);

	//Here are some more examples of how strings can be used: 

	

	
	public void print() {
		System.out.println("abc");
		String cde = "cde";
		System.out.println("abc" + cde);
		String c = "abc".substring(2,3);
		String d = cde.substring(1, 2);
	}
	
	
	
	public static void main(String[] args) {
		
		StringSringBufferSringBuilderDemo obj = new StringSringBufferSringBuilderDemo();
		StringSringBufferSringBuilderDemo obj1 = new StringSringBufferSringBuilderDemo();
		StringSringBufferSringBuilderDemo obj2 = new StringSringBufferSringBuilderDemo();
		
		System.out.println(obj.str);//abc
		
		obj.str.concat("efg");
		System.out.println(obj.str);
		
		String str1 = obj.str.concat("efg");
		System.out.println(str1);
		


		StringBuffer strb = new StringBuffer("abc");		
		strb.append("efg");
		System.out.println("Sring Buffer : "+strb);
		
		
		StringBuilder strbu = new StringBuilder("abc");
		strbu.append("efg");
		System.out.println("Sring Builder : "+strb);
	}


}
