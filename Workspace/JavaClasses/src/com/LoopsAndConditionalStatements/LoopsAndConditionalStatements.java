package com.LoopsAndConditionalStatements;

public class LoopsAndConditionalStatements {
	
	//If<condition>
	//If<condition> else
	//If<condition> else if<condition> else
	//for
	//while
	//do-while
	//switch
	//continue
	//break
	
	
	
	public LoopsAndConditionalStatements(int x,int y) {
		
		if(x == y)
			System.out.println("Equal");
		else if(x > y)
			System.out.println("x > y");
		else if(x < y)
			System.out.println("x < y");
		
	}

	public static void main(String[] args) {
		LoopsAndConditionalStatements obj = new LoopsAndConditionalStatements(10,20);
		LoopsAndConditionalStatements obj1 = new LoopsAndConditionalStatements(20,20);
		LoopsAndConditionalStatements obj2 = new LoopsAndConditionalStatements(20,10);
		
		obj1.forLoop(3);
		obj1.whileLoop(3);
		obj1.forLoopWithBreak(100,99);
		obj1.forLoopWithContinue(100,99);
	}
	
	public void forLoop(int count) {		
		for(int i = 0; i <= count ; i++) {//i = i+1
			System.out.println(i);
		}		
	}
	
	public void whileLoop(int count) {	
		int i = 0;
		while(i <= count)	{
			System.out.println(i);
			i++;
		}
	}
	
	public void doWhileLoop(int count) {	
		int i = 0;
		do{
			System.out.println(i);
			i++;
		}while(i <= count);
		
		
	}
	
	public void forLoopWithBreak(int count,int targetNumber) {		
		for(int i = 0; i <= count ; i++) {//i = i+1
			System.out.println(i);
			
			if(i == targetNumber)
				break;			
		}
		
		
	}
	
	public void forLoopWithContinue(int count,int targetNumber) {		
		for(int i = 0; i <= count ; i++) {//i = i+1
			
			
			if(i == targetNumber)
				continue;
			
			System.out.println(i);
		}		
	}

}
