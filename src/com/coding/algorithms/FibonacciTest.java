package com.coding.algorithms;

public class FibonacciTest {
	
	public static void main(String[] args) {
		System.out.println(fibonacci(50));
		System.out.println(fibonacciWithCache(50, new long[51]));
	}
	
	private static long fibonacci(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	private static long fibonacciWithCache(int n, long[] cache) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		if (cache[n] == 0) {
			cache[n] = fibonacciWithCache(n-1, cache) + fibonacciWithCache(n-2, cache);
		}
		return cache[n];
	}

}
