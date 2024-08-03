package com.CollectionEx;

import java.util.Comparator;

public class AddComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getAdd().compareTo(o2.getAdd());
	}

}
