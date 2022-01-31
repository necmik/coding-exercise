package com.coding.algorithms.sorting;

public class SelectionSort {

	static void sort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			int minIndex = i;
			for (int j = i; j < list.length; j++) {
				if (list[j] < list[minIndex]) {
					minIndex = j;
				}
			}
			
			if (i != minIndex) {
				int temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}
	}
	
	static void printList(int[] list) {
		for (int i =0; i < list.length ; i++) {
			System.out.print(list[i]);
			if (i != list.length-1) {
				System.out.print(", ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] list = new int[] {1, -9, 11, 23, 7, 0, -4, 12, 7};
		sort(list);
		printList(list);
		
	}
}
