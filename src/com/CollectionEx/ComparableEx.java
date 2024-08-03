package com.CollectionEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableEx {
	public static void main(String[] args) {
		
	
	ArrayList<Employee> emps=new ArrayList<Employee>();
	
	emps.add(new Employee("sandhya","567",3));
	emps.add(new Employee("shweta","123",2));
	emps.add(new Employee("java","987",1));
	
	System.out.println(emps);
	
	Collections.sort(emps);
	
	System.out.println(emps); // sorting using comparable 
	
	

	}
}
