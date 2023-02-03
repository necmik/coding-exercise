package com.coding.datastructures;

import java.util.Arrays;

/**
 * 
 * @author necmikilic
 *
 *         Given two arrays A and B of length N, determine if there is a way to
 *         make A equal to B by reversing any subarrays from array B any number
 *         of times. Signature bool areTheyEqual(int[] arr_a, int[] arr_b) Input
 *         All integers in array are in the range [0, 1,000,000,000]. Output
 *         Return true if B can be made equal to A, return false otherwise.
 *         Example A = [1, 2, 3, 4] B = [1, 4, 3, 2] output = true After
 *         reversing the subarray of B from indices 1 to 3, array B will equal
 *         array A.
 */

public class ReverseEqual {

	// Add any helper functions you may need here
	static int[] reverseArray(int[] array, int startIndex, int endIndex) {
		int[] newArray = new int[array.length];
		System.arraycopy(array, 0, newArray, 0, array.length);
		int temp;
		for (int i = startIndex; i <= (startIndex + endIndex) / 2; i++) {
			temp = array[i];
			newArray[i] = newArray[startIndex + endIndex - i];
			newArray[startIndex + endIndex - i] = temp;
		}
		return newArray;
	}

	static boolean areTheyEqual(int[] array_a, int[] array_b) {
		// Write your code here
		int length = array_a.length;
		int differIndex = -1;
		for (int i = 0; i < length; i++) {
			if (array_a[i] != array_b[i]) {
				differIndex = i;
				break;
			}
		}

		if (differIndex == -1)
			return true;

		int n = 1;
		while (n < length - differIndex) {
			int[] reversedArray = reverseArray(array_b, differIndex, differIndex + n);
			if (Arrays.equals(array_a, reversedArray))
				return true;
			n++;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array_a_1 = { 1, 2, 3, 4 };
		int[] array_b_1 = { 1, 4, 3, 2 };
		boolean output_1 = areTheyEqual(array_a_1, array_b_1);
		System.out.println(output_1);
	}

}
