package com.HumanCloud;

public class Pattern {
	
	public static void main(String[] args) {
		
		int count=1;
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(count);
				count++;
				
				//System.out.println("*");
			}
			
			System.out.println();
			
			count=1;
		}
		
		
	}

}
