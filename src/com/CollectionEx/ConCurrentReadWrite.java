package com.CollectionEx;

	
	

	import java.util.HashMap;
import java.util.Map;
	import java.util.concurrent.ConcurrentHashMap;

	public class ConCurrentReadWrite {

	    public static void main(String[] args) {
 	        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
         // Map <Integer,String> map=new HashMap<Integer, String>();
	        map.put(1, "sandhya");
	        map.put(2, "java");
	        map.put(3, "advanced java");

	        // Runnable for reading the map
	        Runnable reader = () -> {
	            for (Map.Entry<Integer, String> entry : map.entrySet()) {
	                System.out.println("Read: Key: " + entry.getKey() + ", Value: " + entry.getValue());
	                try {
	                    Thread.sleep(100);
	                } catch (InterruptedException e) {
	                    Thread.currentThread().interrupt();
	                }
	            }
	        };

	        // Runnable for writing to the map
	        Runnable writer = () -> {
	            for (int i = 4; i < 10; i++) {
	                map.put(i, "value" + i);
	                System.out.println("Written: Key: " + i + ", Value: " + "value" + i);
	                try {
	                    Thread.sleep(100);
	                } catch (InterruptedException e) {
	                    Thread.currentThread().interrupt();
	                }
	            }
	        };

	        Thread readerThread1 = new Thread(reader);
	        Thread readerThread2 = new Thread(reader);
	        Thread writerThread = new Thread(writer);

	        readerThread1.start();
	        readerThread2.start();
	        writerThread.start();
	    }
	}



