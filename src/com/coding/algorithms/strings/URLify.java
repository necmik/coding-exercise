package com.coding.algorithms.strings;

public class URLify {
	public static void main(String[] args) {
		System.out.println(urlifyit("Mr John Smith   "));
		System.out.println(urlifyit2("Mr John Smith   "));
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
		for (char c : charArray) {
			if (c == ' ') {
				newStr = newStr.concat("%20");
			} else {
				newStr = newStr.concat(String.valueOf(c));
			}
		}

		return newStr;
	}
}
