package com.HumanCloud;

public class ArmstrongNo {
	
	public static void main(String[] args) {
		
		int i=153;
		
		int i1=i;
		
		int sum=0,temp=1;
		
		while(i>0) {
			int i3=i1%10;
			temp=i3*i3*i3;
			
			i1=i1/10;
			sum=sum+temp;
			
			System.out.println(sum);
			
		}
		
		if(sum==i) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
