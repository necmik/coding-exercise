package com.coding.stringoperations;

import java.util.HashSet;
import java.util.Set;

public class UniqueTest {

	public static void main(String[] args) {
		System.out.println(isUnique("123asdf"));
	}
	
	private static boolean isUnique(String str) {
		Set<Character> strSet = new HashSet<Character>();
		for (int i=0; i<str.length(); i++) {
			strSet.add(str.charAt(i));
		}
		if (strSet.size() != str.length()) return false;
		return true;
	}
}
