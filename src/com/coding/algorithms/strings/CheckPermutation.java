package com.coding.algorithms.strings;

import java.util.Arrays;

/**
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other.
 * @author necmikilic
 *
 */
public class CheckPermutation {

	public static void main(String[] args) {
		CheckPermutation permutation = new CheckPermutation();
		//spermutation.permutation("ABCDEF", "");
		System.out.println(permutation.isPermutation("ABCDEF", "", "CDEABF"));
		System.out.println(permutation.isPermutation("ABCDEF","CDEABF"));
	}
	
	void permutation(String str, String prefix) {
		if (str.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i=0; i<str.length(); i++) {
				String rem = str.substring(0,i) + str.substring(i+1);
				permutation(rem, prefix+str.charAt(i));
			}
		}
	}
	
	boolean isPermutation(String str, String prefix, String permStr) {
		if (str.length() == 0) {
			if (prefix.equals(permStr)) return true;
		} else {
			for (int i=0; i<str.length(); i++) {
				String rem = str.substring(0,i) + str.substring(i+1);
				if (isPermutation(rem, prefix+str.charAt(i), permStr)) return true;
			}
		}
		return false;
	}
	
	//optimized
	private boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		return (new String(c1).equals(new String(c2)));
	}
}
