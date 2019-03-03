package com.coding.algorithms.math;

public class NumberSwapper {
	
	public static void main(String[] args) {
		Integer a = 15;
		Integer b = 4;
		
		System.out.println("a:" + a + ",b:" + b);
		int diff = a - b;
		b = b + diff;
		a = a - diff;
		System.out.println("a:" + a + ",b:" + b);
	}
}
