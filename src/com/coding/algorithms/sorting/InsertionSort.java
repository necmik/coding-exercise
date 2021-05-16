package com.coding.algorithms.sorting;

/**
 * 
 * @author Necmi
 * Move elements inside the subarray.
 */
public class InsertionSort {

	void sort(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		InsertionSort ob = new InsertionSort();
		int arr[] = { 4, 3, 5, 2, 1, 9, -3 };
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
