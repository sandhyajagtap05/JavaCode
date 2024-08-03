package com.Java8Features;

public class LambdaExpression {
	
	public static void main(String[] args) {
		AddTwoNumber a1= (a,b)->{int c=a+b;
		System.out.println(c);
			
				
		};
		
		a1.m1(3, 6);
		
		
		AddTwoNumber a2=(a,b)->{
			int d=a+b;
			
			System.out.println(d);
		};
		
		a1.m1(90, 100);
	}

}
