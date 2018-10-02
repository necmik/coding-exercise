package com.coding.stringoperations;

public class StringRotation {
	
	public static void main(String[] args) {
		System.out.println(isRotate("waterbottle", "erbottlewat"));
	}
	static boolean isRotate(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		
		String ss1 = s1+s1;
		return ss1.contains(s2);
	}
}
