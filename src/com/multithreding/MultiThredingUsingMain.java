package com.multithreding;



public class MultiThredingUsingMain implements Runnable{
	
	public void run(){
		
		for(int i=0;i<10;i++) {
		System.out.println("i am in 2nd class");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	public static void main(String[] args) {
		Runnable r=new MultiThredingUsingMain();//here reference of runnable  interface which parent and then creating object of subclass 
		
			Runnable r2=new MultiThredingUsingInterface();//same here
			
			
			Thread t=new Thread(r);
			
			Thread t1=new Thread(r2);

			
			
			t.start();
			
			t1.start();
			
	} 

}
