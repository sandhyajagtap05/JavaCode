package com.HumanCloud;



	
	import java.util.*;

	public class abc {
	    public static String findMaxAnagramGroup(String words) {
	        // Split the input string into individual words
	        String[] wordArray = words.split(" ");

	        // Map to hold the sorted word as key and list of anagrams as value
	        Map<String, List<String>> anagramGroups = new HashMap<>();

	        for (String word : wordArray) {
	            // Sort the characters of the word
	            char[] charArray = word.toCharArray();
	            Arrays.sort(charArray);
	            String sortedWord = new String(charArray);
               System.out.println(sortedWord);
	            // Add the word to the corresponding anagram group
	            if (!anagramGroups.containsKey(sortedWord)) {
	                anagramGroups.put(sortedWord, new ArrayList<>());
	            }
	            anagramGroups.get(sortedWord).add(word);
	        }

	        // Find the group with the maximum number of anagrams
	        List<String> maxAnagramGroup = new ArrayList<>();
	        for (List<String> group : anagramGroups.values()) {
	            if (group.size() > maxAnagramGroup.size()) {
	                maxAnagramGroup = group;
	            }
	        }

	        // Convert the list to a string format as required in the output
	        return maxAnagramGroup.toString();
	    }

	    public static void main(String[] args) {
	        String words = "eat tea tan ate nat bat";
	        String output = findMaxAnagramGroup(words);
	        System.out.println(output);
	    }
	}

