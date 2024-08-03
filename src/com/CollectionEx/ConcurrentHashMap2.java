package com.CollectionEx;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap2 {
	public static void main(String[] args) {
		
	
	//ConcurrentHashMap<Integer,String> m1=new ConcurrentHashMap();
		
		Map<Integer,String> m1=new HashMap<Integer, String>();
	
	
	m1.put(1,"sandhya");
	m1.put(2, "java");
	m1.put(3, "collection");
	
	Runnable r1=()->{
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			for(Map.Entry<Integer, String> m2:m1.entrySet())
			System.out.println(m2.getKey()+" "+m2.getValue());
		
	};
	
	
	
	 Runnable r2 = () -> {
         for (int i = 4; i < 10; i++) {
             m1.put(i, "value" + i);
             try {
                 Thread.sleep(50); // Small delay to simulate concurrent modifications
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
             }
         }
     };
	
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
    t1.start();
    t2.start();

	}

}
