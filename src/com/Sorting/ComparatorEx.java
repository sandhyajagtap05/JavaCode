package com.Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparatorEx {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		
		al.add(new Employee(1234,"sandhya","satara"));
		
		al.add(new Employee(456,"vaishnavi","delhi"));
		
		Collections.sort(al,new IdComarator());
		
		System.out.println(al);
		
		Collections.sort(al,new NameComparator());
		
		System.out.println(al);
		
	}

}
