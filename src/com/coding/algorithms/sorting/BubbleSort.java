package com.coding.algorithms.sorting;

/**
 * 
 * @author necmikilic
 *Bubble Sort I Runtime: 0(n2) average and worst case. Memory: 0(1).
 */
public class BubbleSort {

	static void sort(int[] list) {
		int tmp = 0;
		
		for (int i=0; i < list.length - 1; i++) {
			for (int j = i+1; j < list.length; j++) {
				if (list[i] > list[j]) {
					tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
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
