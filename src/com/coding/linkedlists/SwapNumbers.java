package com.coding.linkedlists;

/**
 * Write a function to swap numbers without temporary variable.
 * @author Necmi
 *
 */
public class SwapNumbers {
	
	public static void main(String[] args) {
		int a = 9;
		int b = 5;
		
		System.out.println("a:"+a+", b:" + b);
		a -= b;
		b+=a;
		a = b-a;
		System.out.println("a:"+a+", b:" + b);
	}
}
