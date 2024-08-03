package com.Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApi {
	
	public static void main(String[] args) {
		
		//List<Integer> li=new ArrayList<>();
		
		
		List<Integer> li=Arrays.asList(12,78,90,35);
		
		
		List<Integer> newList=li.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		List<Integer> newList2=li.stream().map(i->i*2).collect(Collectors.toList());
		
		
		List<Integer> newList3=li.stream().filter(i->i%2==0).map(i->i*10).collect(Collectors.toList());
		
		//List<Integer> newList3=li.stream().map(i->i*10).filter(i->i%2==0).collect(Collectors.toList());
		
		List<Integer> newList4=li.stream()
				.filter(n->{
					System.out.println("hello");
					return true;
				})
				.collect(Collectors.toList());


		System.out.println(newList);
		
		System.out.println(newList2);
		
		
		System.out.println(newList3);
		
		System.out.println(newList4);
		
	}

}
