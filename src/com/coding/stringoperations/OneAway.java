package com.coding.stringoperations;

public class OneAway {
	
	public static void main(String[] args) {
		String s1 = "pale";
		String s2 = "paler";
		
		System.out.print(isOneAway(s1, s2));
	}
	
	private static boolean isOneAway(String s1, String s2) {
		if (Math.abs(s1.length()-s2.length()) > 1) return false;
		
		if (s1.length() == s2.length()) return oneReplaceAway(s1, s2);
		
		return oneInsertAway(s1, s2);
	}
	
	private static boolean oneReplaceAway(String s1, String s2) {
		boolean foundDif = false;
		for (int i=0; i<s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (foundDif) return false;
				foundDif = true;
			}
		}
		return true;
	}
	
	private static boolean oneInsertAway(String s1, String s2) {
		int idx1 = 0;
		int idx2 = 0;
		
		boolean foundDif = false;
		while (idx1 < s1.length() && idx2 < s2.length()) {
			if (s1.charAt(idx1) != s2.charAt(idx2)) {
				if (foundDif) return false;
				if (s1.length() > s2.length()) {
					idx1++;
				} else {
					idx2++;
				}
				foundDif = true;
			}
			idx1++;
			idx2++;
		}
		return true;
	}

}
