package com.multithreding;

public class SynocronizedMain {
	
	public static void main(String[] args) {
		SynchronizationPractice s=new SynchronizationPractice();
		
		Runnable r=()->{
			for(int i=0;i<8000;i++) {
				s.counter();
				//System.out.println("hello");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		
		
		
		Runnable r1=()->{
			for(int i=0;i<9000;i++) {
				s.counter();
				//System.out.println("hello");
			}
		};
		
		Thread t1=new Thread(r1);
		t1.start();
		
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s.count);
	}


}
