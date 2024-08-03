package com.CollectionEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListEx {
	
	
	public static void main(String[] args) {
		
		List<Integer> c=new ArrayList<>();
		
		c.add(11);
		c.add(22);
		c.add(33);
		c.add(44);
		
		for(Integer i:c) {
			System.out.println(i*2);
		}
		
		System.out.println(c.get(2)+"index is ");
		
		System.out.println(c.indexOf(33));
		
	}

}
