package com.coding.collections;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencies {
	
	public static void main(String[] args) {
		Map<String, Integer> map = collectData("eerr rerer fsdfr 12er re eerr");
		System.out.println(findFrequency(map, "deded"));
		System.out.println(findFrequency(map, "eerr"));
		System.out.println(findFrequency(map, "fsdfr"));
	}

	static Map<String, Integer> collectData(String book) {
		book = book.trim().toLowerCase();
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		String[] words = book.split(" ");
		for (String word : words) {
			if (wordMap.containsKey(word)) {
				Integer i = wordMap.get(word);
				wordMap.put(word, ++i);
			} else {
				wordMap.put(word, Integer.valueOf(1));
			}
		}
		return wordMap;
		
	}
	static int findFrequency(Map<String, Integer> wordMap, String word) {
		if (wordMap.containsKey(word.toLowerCase())) return wordMap.get(word.toLowerCase()).intValue();
		return 0;
	}
}
