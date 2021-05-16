package com.coding.algorithms.sorting;

/**
 * 
 * @author Necmi
 * Find the minimum and place it to current index.
 */
public class SelectionSort {
	void selectionSort(int[] arr) {
		int arrSize = arr.length;
		for (int i = 0; i < arrSize; i++) {
			int minIndex = i;
			for (int j=i; j < arrSize; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}
	}
	
	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		SelectionSort ob = new SelectionSort();
		int arr[] = { 4, 3, 5, 2, 1, 9, -3 };
		ob.selectionSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
