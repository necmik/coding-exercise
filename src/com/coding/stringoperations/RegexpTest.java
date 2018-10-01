package com.coding.stringoperations;

public class RegexpTest {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("13122922929");
		sb =sb.insert(1," ")
                .insert(5," ")
                .insert(9," ")
                .insert(12," ");
		
		System.out.println(sb);
		
	}
}
