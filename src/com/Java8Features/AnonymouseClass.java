package com.Java8Features;

public class AnonymouseClass {   // if there is more than one  methods then we can't use lambda expression
	                               // for that we can using  AnonymouseClass class
	
	public static void main(String[] args) {
		
		AddTwoNumber no1=new AddTwoNumber() {
			
			@Override
			public void m1(int a, int b) {
				int c=a+b;
				System.out.println(c);
				
			}
		};
		
		no1.m1(10, 50);
		
		
		
      AddTwoNumber no2=new AddTwoNumber() {
			
			@Override
			public void m1(int a, int b) {
				int c=a+b;
				System.out.println(c);
				
			}
		};
		
		no2.m1(100, 500);

}
}
