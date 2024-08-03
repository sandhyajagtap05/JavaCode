package com.CollectionEx;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	
	public static void main(String[] args) {
		
		Set<Integer> s=new TreeSet<Integer>();
		
		s.add(34);
		s.add(90);
		s.add(90);
		s.add(176);
		
		
//		System.out.println(s);
		
		
		for(Integer ss:s) {
			System.out.println(ss);
		}
		
		
         Iterator i=s.iterator();
         
         while(i.hasNext()) {
        	 //System.out.println((int)i.next()*100);
        	 
        	 System.out.println(i.next());
         }
	}
}
