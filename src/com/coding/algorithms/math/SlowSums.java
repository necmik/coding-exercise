package com.coding.algorithms.math;

import java.util.Arrays;

public class SlowSums {

	static int[] getPenalty(int[] arr, int startIndex, int[] penalties) {
		if (startIndex == arr.length - 2)
			return penalties;

		// totalPenalty = totalPenalty + arr[startIndex+1];
		penalties[startIndex] = penalties[startIndex - 1] + arr[startIndex++];

		return penalties;
	}

	static int getTotalTime(int[] arr) {
		Arrays.sort(arr);
		for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
			// exchange the first and last
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}

		int[] penalties = new int[arr.length - 1];
		penalties[0] = arr[0] + arr[1];
		for (int i = 1; i < arr.length - 1; i++) {
			penalties[i] = penalties[i - 1] + arr[i + 1];
		}

		int sum = 0;
		for (int i = 0; i < penalties.length; i++)
			sum += penalties[i];

		return sum;
	}

	public static void main(String[] args) {
		int[] arr_1 = { 4, 2, 1, 3 };
		System.out.println(getTotalTime(arr_1));
	}

}
