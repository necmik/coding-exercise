package com.coding.algorithms.strings;

/**
 * One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
 * @author necmikilic
 *
 */
public class OneAway {
	
	static boolean checkOneWay(String s1, String s2) {
		
		if (Math.abs(s1.length() - s2.length()) > 1) return false;		
		
		for (int i=0; i < s1.length() && i < s2.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (s1.length() > s2.length()) {
					return s1.substring(i+1).equals(s2.substring(i));
				} else if(s2.length() > s1.length()) {
					return s1.substring(i).equals(s2.substring(i+1));
				}
				return s1.substring(i+1).equals(s2.substring(i+1));
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] sList1 = new String[]{"pale", "pales", "pale", "pale"};
		String[] sList2 = new String[]{"ple", "pale", "bale", "bake"};
		
		for (int i =0; i < sList1.length; i++) {
			System.out.println(checkOneWay(sList1[i], sList2[i]));
		}
	}
}
