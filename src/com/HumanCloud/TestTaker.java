package com.HumanCloud;



	
	import java.util.*;

	public class TestTaker {

	    public static String[] findMax(String words) {
	        if (words == null || words.isEmpty()) {
	            return new String[0];
	        }

	        String[] wordArray = words.split("\\s+");
	        Map<String, List<String>> anagramGroups = new HashMap<>();

	        for (String word : wordArray) {
	            char[] charArray = word.toCharArray();
	            Arrays.sort(charArray);
	            String sortedWord = new String(charArray);
	            anagramGroups.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
	        }

	        List<String> maxAnagramGroup = new ArrayList<>();
	        for (List<String> group : anagramGroups.values()) {
	            if (group.size() > maxAnagramGroup.size()) {
	                maxAnagramGroup = group;
	            } else if (group.size() == maxAnagramGroup.size()) {
	                int firstOccurrenceIndex = Integer.MAX_VALUE;
	                for (String word : group) {
	                    int index = Arrays.asList(wordArray).indexOf(word);
	                    if (index < firstOccurrenceIndex) {
	                        firstOccurrenceIndex = index;
	                    }
	                }
	                int maxFirstOccurrenceIndex = Integer.MAX_VALUE;
	                for (String word : maxAnagramGroup) {
	                    int index = Arrays.asList(wordArray).indexOf(word);
	                    if (index < maxFirstOccurrenceIndex) {
	                        maxFirstOccurrenceIndex = index;
	                    }
	                }
	                if (firstOccurrenceIndex < maxFirstOccurrenceIndex) {
	                    maxAnagramGroup = group;
	                }
	            }
	        }

	        return maxAnagramGroup.toArray(new String[0]);
	    }

	    public static void main(String[] args) {
	        String words = "eat tea tan ate nat bat";
	        String[] result = findMax(words);
	        System.out.println(Arrays.toString(result));
	    }
	
}
