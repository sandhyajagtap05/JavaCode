package com.multithreding;

public class SynchronizationPractice {
	int count;
	public synchronized void counter() {
		
		
		//System.out.println(count++);
		
		count++;
		
	}
	
	
}
