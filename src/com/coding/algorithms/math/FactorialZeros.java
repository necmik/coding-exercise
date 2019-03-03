package com.coding.algorithms.math;

public class FactorialZeros {
	
	public static void main(String[] args) {
		System.out.println(getZeros(25));
	}

	static int getZeros(int num) {
		if (num <5 ) return 0;
		
		int count = 0;
		for (int i=5; i<=num; i*=5) {
			if (i%5 == 0) {
				int temp = i;
				while(temp >= 5) {
					count++;
					temp = temp/5;
				}
			}
		}
		
		return count;
	}
}
