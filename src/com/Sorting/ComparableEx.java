package com.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEx {
	
	public static void main(String[] args) {
		
		ArrayList<Customer> al=new ArrayList<Customer>();
		
		al.add(new Customer(1,"java","mumbai"));
		
		al.add(new Customer(22,"hibernate","pune"));
		
		al.add(new Customer(3,"spring","Delhi"));
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
	}

}
