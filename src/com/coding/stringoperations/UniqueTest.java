package com.coding.stringoperations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueTest {

	public static void main(String[] args) {
		System.out.println(isUnique("123asdf"));
		System.out.println(isUniqueWithoutSet("123asd2"));
	}
	
	private static boolean isUnique(String str) {
		Set<Character> strSet = new HashSet<Character>();
		for (int i=0; i<str.length(); i++) {
			strSet.add(str.charAt(i));
		}
		if (strSet.size() != str.length()) return false;
		return true;
	}
	
	//without a data structure
	private static boolean isUniqueWithoutSet(String str) {
		if (str.isEmpty() || str.length() == 1) return true;
		
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		char prev=charArray[0];
		for (int i=1; i<charArray.length; i++) {
			if (charArray[i] == prev) return false;
			prev = charArray[i];
		}
		return true;
	}
}
