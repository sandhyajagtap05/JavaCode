package com.linkedList;

public class Runner {
	
	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
		
		li.add(11);
		li.add(12);
		li.add(13);
		
		li.addStart(100);
		
		li.addAt(2,200);
		li.display();
		
		
	}

}
