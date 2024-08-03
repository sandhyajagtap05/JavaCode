package com.CollectionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapRemove {
  public static void main(String[] args) {
	
	  ConcurrentHashMap<Integer,String> m1=new ConcurrentHashMap<>();
	  
	  //Map<Integer,String> m1=new HashMap<Integer, String>();
	  
	  
	  m1.put(1, "sandhya");
	  m1.put(2, "java");
	  m1.put(3, "advanced java");
	  
	  Iterator<Map.Entry<Integer,String>> itr=m1.entrySet().iterator();
	  
	  while(itr.hasNext()) {
		  Map.Entry<Integer,String> current=(Entry<Integer, String>) itr.next();
		  
		  if(current.getKey()==2) {
			  
			  itr.remove();
		  } 
		  //else {
//              System.out.println("Key: " + current.getKey() + ", Value: " + current.getValue());
//
//		  }
		  System.out.println(itr.next());
	  }
	  
	  
	  
	  
	  
}
}
