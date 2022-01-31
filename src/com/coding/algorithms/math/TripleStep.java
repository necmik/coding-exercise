package com.coding.algorithms.math;

/**
 * 
 * @author necmikilic
 *
 *Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
steps at a time. Implement a method to count how many possible ways the child can run up the
stairs.
 */
public class TripleStep {

	static int findStep(int n) {
		if (n < 0) return 0;
		if (n == 0) return 1;
		
		return findStep(n -3) + findStep(n -2) + findStep(n -1);
	}
	public static void main(String[] args) {
		int steps = findStep(3);
		System.out.println(steps);
	}
}
