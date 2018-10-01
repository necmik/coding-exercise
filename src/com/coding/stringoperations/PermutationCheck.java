package com.coding.stringoperations;

import java.util.Arrays;

public class PermutationCheck {

	public static void main(String[] args) {
		String s1 = "2434454543fefe";
		String s2 = "2434454543fefe";
		System.out.print(isPermutation(s1, s2));
	}
	
	private static boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		return (new String(c1).equals(new String(c2)));
	}
}
