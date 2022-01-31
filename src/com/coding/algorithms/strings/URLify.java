package com.coding.algorithms.strings;

/**
 * URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)
EXAMPLE
Input: "Mr John Smith "J 13
Output: "Mr%20J ohn%20Smith"
 *
 * @author necmikilic
 *
 */
public class URLify {
	public static void main(String[] args) {
		System.out.println(urlifyit("Mr John     Smith   "));
		System.out.println(urlifyit2("Mr John    Smith   "));
	}
	
	private static String urlifyit(String str) {
		if (null == str) return null;
		
		str = str.trim();
		str = str.replaceAll(" ", "%20");
		return str;
	}
	
	private static String urlifyit2(String str) {
		if (null == str) return null;
		
		String newStr = "";
		char[] charArray = str.trim().toCharArray();
		boolean replaced = false;
		for (char c : charArray) {
			if (c == ' ') {
				if (!replaced) {
					newStr = newStr.concat("%20");
					replaced = true;
				}
			} else {
				replaced = false;
				newStr = newStr.concat(String.valueOf(c));
			}
		}

		return newStr;
	}
}
