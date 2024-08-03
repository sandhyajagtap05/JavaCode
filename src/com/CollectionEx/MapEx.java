package com.CollectionEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapEx {
	
	public static void main(String[] args) {
		
		Map<Integer,String> m1=new HashMap<>();
		
		
		m1.put(1,"sandhya");
		m1.put(2, "java");
		m1.put(3, "collection");
		
		System.out.println(m1);
		// using keySet
//		for(Integer m2:m1.keySet()) {
//		System.out.println(m2+" "+m1.get(m2));
//	}
		// using entrySet()
		
		for(Map.Entry<Integer, String> m3:m1.entrySet()) {
			
			System.out.println(m3.getKey()+" "+m3.getValue());
		}
		
		
		// using value
		
		
		for(String s:m1.values()) {
			System.out.println(s);
		}
	}

}
