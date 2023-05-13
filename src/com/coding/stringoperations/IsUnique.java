package com.coding.stringoperations;

import java.util.HashSet;
import java.util.Set;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
 * @author necmikilic
 *
 */
public class IsUnique {

	public static void main(String[] args) {
		Set<Character> allCharSet = new HashSet<>();
		for (int i = 65; i<=90; i++) allCharSet.add((char) i);
		
		String s = "abcdefghjiqklmnoprstuvwyzx";
		
		s = s.toUpperCase();
		char[] charSet = s.toCharArray();
		for (char c : charSet) {
			allCharSet.remove(c);
		}
		
		boolean isUnique = allCharSet.isEmpty();
		System.out.println(isUnique);
	}
}
