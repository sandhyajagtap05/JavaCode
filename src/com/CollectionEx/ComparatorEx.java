package com.CollectionEx;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorEx {

	
	public static void main(String[] args) {
		
		ArrayList<Customer> li=new ArrayList<>();
		
		li.add(new Customer(3,"sandhya","khatav"));
		li.add(new Customer(2, "Shweta","satara"));
		
		li.add(new Customer(1,"vaishnavi","mumbai"));
		
		
		System.out.println(li);
		
		Collections.sort(li,new IdComparator());
		
		System.out.println(li);
		
		
		ArrayList<Customer> li1=new ArrayList<>(li);
		
		Collections.sort(li1,new NameComparator());
		
		System.out.println(li1);
		
		
        ArrayList<Customer> li2=new ArrayList<>(li);
		
		Collections.sort(li2,new AddComparator());
		
		System.out.println(li2);
		
		
	}
}
