package com.HumanCloud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracriceAnagrams {
	
	public static String FindAragrams(String words) {
		
		
		String[] StringArray=words.split(" ");
		
		Map<String,List<String>> anagramGroup=new HashMap<>();
		
		for(String word:StringArray) {
			char[] charArray=word.toCharArray();
			
			Arrays.sort(charArray);
			
			String SortedWord=new String(charArray);
			
			if(!anagramGroup.containsKey(SortedWord)) {
				anagramGroup.put(SortedWord,new ArrayList<String>());
			}
			
			anagramGroup.get(SortedWord).add(word);
		}
		
		List<String> countAnagram=new ArrayList<String>();
		for(List<String> group:anagramGroup.values()) {
			if(group.size()>countAnagram.size()) {
				countAnagram=group;
			}
		}
		return countAnagram.toString();
	}
	
	public static void main(String[] args) {
		String words="eat tea tan ate nat bat";
		
		String output=FindAragrams(words);
		
		System.out.println(output);
	}

}
