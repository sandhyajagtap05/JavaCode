package com.multithreding;

public class Counter2 extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("hii");
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
