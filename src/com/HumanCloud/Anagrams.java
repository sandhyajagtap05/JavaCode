package com.HumanCloud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
	
	public  static String group(String words) {
		
		String[] wordArray=words.split(" ");
		
		Map<String,List<String>> anagramGroups=new HashMap<>();
		
		for(String word:wordArray) {
			char[] charArray=word.toCharArray();
			
			Arrays.sort(charArray);
			
			String sortWorld=new String(charArray);
			
			
			if(!anagramGroups.containsKey(sortWorld)) {
				anagramGroups.put(sortWorld, new ArrayList<String>());
			}
			anagramGroups.get(sortWorld).add(words);
		}
		
		List<String> MaxAnagramGroup=new ArrayList<String>();
		
		for(List<String> Group:anagramGroups.values()) {
			if(Group.size()>MaxAnagramGroup.size()) {
				MaxAnagramGroup=Group;
			}
		}
		
		return MaxAnagramGroup.toString();
	}
	
	
	
	
	public static void main(String[] args) {
		 String words = "eat tea tan ate nat bat";
		 String output=group(words);
		 
		 System.out.println(output);
	}

}
