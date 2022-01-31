package com.coding.algorithms.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rea rrangement of letters. The palindrome does not need to be limited to just dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat". "atco cta". etc.)
 * @author necmikilic
 *
 */

public class PalindromePermutation {

	static boolean isPalindrome(String s) {
		Map<Character, Integer> charMap = new HashMap<>();
		char[] charSet = s.toLowerCase().toCharArray();
		for (char c : charSet) {
			//skip space character
			if (c == ' ') continue;
			charMap.merge(c, 1, Integer::sum);
		}
		
		int oddCharCount = 0;
		for (Integer charCount : charMap.values()) {			
			
			if (charCount % 2 == 1) oddCharCount ++;
			
			if (oddCharCount > 1) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s = "Tact Coa";		
		System.out.println(isPalindrome(s));
		
		s = "Tact Coat";		
		System.out.println(isPalindrome(s));
		
		s = "Tact     Coa";		
		System.out.println(isPalindrome(s));
		
		s = "Tact Coa   r";		
		System.out.println(isPalindrome(s));
	}
}
