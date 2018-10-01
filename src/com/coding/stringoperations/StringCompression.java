package com.coding.stringoperations;

public class StringCompression {
	
	public static void main(String[] args) {
		System.out.println(compress("aabccccaaa"));
		System.out.println(compress("aabccccaaax"));
		System.out.println(compress("abccdeeeefff"));
	}
	
	private static String compress(String str) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		
		int repeatedTimes = 1;
		for (int i =0; i< str.length()-1; i++) {
			repeatedTimes++;
			if (str.charAt(i) != str.charAt(i+1)) {
				sb.append(repeatedTimes);
				sb.append(str.charAt(i+1));
				repeatedTimes = 1;
			}
		}
		sb.append(repeatedTimes);
		
		if (sb.length() > str.length()) return str;
		return sb.toString();
	}
}
