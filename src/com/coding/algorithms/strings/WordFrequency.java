package com.coding.algorithms.strings;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
	
	private static Map<String, Integer> wordMap;
	
	public static void main(String[] args) {
		String book = "vvv ttt g yh ttt 65h ttt. bt";
		System.out.println(getFrequency(book, "ttt"));
	}
	
	static int getFrequency(String book, String word) {
		if (null == wordMap) {
			wordMap = new HashMap<>();
			for (String str : book.split(" ")) {
				str = str.replace(".", "");
				if (wordMap.containsKey(str)) {
					wordMap.put(str, wordMap.get(word).intValue()+1);
				} else {
					wordMap.put(str, 1);
				}
			}
		}
		
		if (wordMap.containsKey(word))
			return wordMap.get(word);
		
		return 0;
	}
	
}
