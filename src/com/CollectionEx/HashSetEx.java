package com.CollectionEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	
	public static void main(String[] args) {
		
		Set s=new HashSet<>();
		
		s.add(12);
		s.add(45);
		s.add(90);
		s.add(100);
		s.add(12);
		
		
		System.out.println(s);
	}
}
