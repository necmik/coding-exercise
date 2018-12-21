package com.coding.algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {23,33,56,90,110, 120,124,126};
		System.out.println(binarySearch(a, 110));
		System.out.println(binarySearch(a, 111));
		System.out.println(binarySearch(a, 23));
		System.out.println(binarySearch(a, 126));
	}
	
	public static int binarySearch(int[] a, int key) {
		int lo = 0;
		int hi = a.length-1;
		
		while(lo <= hi) {
			int mid = lo + (hi-lo)/2;
			if (key < a[mid]) hi = mid-1;
			else if (key > a[mid]) lo = mid+1;
			else return mid;
		}
		return -1;
	}
}
