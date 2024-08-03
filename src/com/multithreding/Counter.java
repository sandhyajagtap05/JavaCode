package com.multithreding;

public class Counter  extends Thread{
	
	//int count;
	public void run() {
		
		for(int i=0;i<10;i++) {
		
		System.out.println("hello");
		//count++;
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	
	public static void main(String[] args) {
		Thread t=new Counter();
		
		t.start();
		
		
		Thread t1=new Counter2();
		
		t1.start();
	}

}
