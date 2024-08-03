package com.CollectionEx;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConCurrentHashMapColl {
	
	public static void main(String[] args) {
		
		List<String> li=new CopyOnWriteArrayList();
		
		//List<String> li=new ArrayList();
		
		//here we can perform two operations at a time i.e iteration and adding elements 
		//without concurrent collections we can not perform both operations at a time
		
		li.add("first");
		li.add("second");
		li.add("third");
		li.add("four");
		li.add("first");
		li.add("first");
		
		Runnable r1=()->{
			
			for(String str:li) {
				System.out.println(str);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		
		
		Runnable r2=()->{
			
			li.add("newList");
			li.add("firstList");
			li.add("secondList");
			
		};
		
		new Thread(r1).start();
		new Thread(r2).start();
		
	}

}
