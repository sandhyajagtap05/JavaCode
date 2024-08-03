package com.HumanCloud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeAnagrams {
	
	
	public static String largestAnagrms(String words) {
		String[] stringArray=words.split(" ");
		
		Map<String,List<String>> AnagrmsList=new HashMap<>();
		
		for(String word:stringArray) {
			char[] charArray=word.toCharArray();
			
			Arrays.sort(charArray);
			
			String SortedWord=new String(charArray);
			
			if(!AnagrmsList.containsKey(SortedWord)) {
				AnagrmsList.put(SortedWord, new ArrayList<String>());
			}
			AnagrmsList.get(SortedWord).add(word);
		}
		
		//System.out.println();
		
		
//		List<String> largestLength=new ArrayList<String>();
//		
//		for(List<String> length:AnagrmsList.values()) {
//			
//			if(length.size()>largestLength.size()) {
//				largestLength=length;
//				System.out.println(largestLength);
//			}
//		}
		
		
		//return largestLength.toString();
		
		return AnagrmsList.values().toString();
	}
	
	public static void main(String[] args) {
		String words="eat tea tan ate nat bat";
		String output=largestAnagrms(words);
		System.out.println(output);
		
	}

}
