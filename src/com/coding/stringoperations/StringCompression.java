package com.coding.stringoperations;

/**
 * 
 * @author necmikilic
 *
 *String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
public class StringCompression {

	static String compressedString(String s) {
		
		String nullTerminatedString = s.concat("0");
		StringBuilder cs = new StringBuilder();
		int cnt = 1;
		for (int i = 0; i < nullTerminatedString.length()-1; i++) {
			if (nullTerminatedString.charAt(i) == nullTerminatedString.charAt(i+1)) {
				cnt ++;
			} else {
				cs = cs.append(nullTerminatedString.charAt(i)).append(cnt);
				cnt = 1;
			}
		}
		
		if (s.length() <= cs.length()) {
			return s;
		} 
		return cs.toString();
	}
	
	
	public static void main(String[] args) {
		
		String s = "aabcccccaaa";
		String cs = compressedString(s);
		
		System.out.println(cs);
		
		s = "abcde";
		cs = compressedString(s);
		System.out.println(cs);
		
		s = "abcdee";
		cs = compressedString(s);
		System.out.println(cs);
		
		s = "abcccdee";
		cs = compressedString(s);
		System.out.println(cs);
		
	}
}
