package com.CollectionEx;

import java.util.Comparator;

public class IdComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}

}
