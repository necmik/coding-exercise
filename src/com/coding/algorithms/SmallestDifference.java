package com.coding.algorithms;

import java.util.Arrays;

public class SmallestDifference {
	
	public static void main(String[] args) {
		int[] a = new int[] {1,9,4,0, 3,19};
		int[] b = new int[] {8,2,5,21,43};
		System.out.println(smallestDiffOptimized(a, b));
	}
	
	static int smallestDiff(int[] a, int[] b) {
		if (a == null || b == null) return -1;
		
		int smallest = Integer.MAX_VALUE;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<b.length; j++) {
				smallest = Math.min(smallest, Math.abs(a[i]-b[j]));
			}
		}
		return smallest;
	}
	
	static int smallestDiffOptimized(int[] a, int[] b) {
		if (a == null || b == null) return -1;
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int smallest = Integer.MAX_VALUE;
		int indexA = 0;
		int indexB = 0;
		
		while(indexA < a.length || indexB < b.length) {
			if (indexA == a.length-1 || indexB == b.length-1) break;
			smallest = Math.min(smallest, Math.abs(a[indexA]-b[indexB]));
			if (a[indexA+1] > b[indexB+1]) {
				indexB++;
			} else {
				indexA++;
			}
		}
		
		return smallest;
	}

}
