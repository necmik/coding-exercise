package com.coding.algorithms.sorting;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
 * representing the number of elements in nums1 and nums2 respectively.

 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.

 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, 
    nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and 
    should be ignored. nums2 has a length of n.
 * 
 * Example:
 	Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
	Output: [1,2,2,3,5,6]
	Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
	The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 *
 * @author necmikilic
 *
 */
public class MergeSortedArray {
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));
		
		nums1 = new int[] {1,0};
		nums2 = new int[] {2};
		merge(nums1, 1, nums2, 1);
		System.out.println(Arrays.toString(nums1));
		
		nums1 = new int[] {2,0};
		nums2 = new int[] {1};
		merge(nums1, 1, nums2, 1);
		System.out.println(Arrays.toString(nums1));
		
		nums1 = new int[] {1,2,3,0,0,0};
		nums2 = new int[] {2,5,6};
		merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0,j = 0 , slideStep = 0; 
        while(i<m+n && j<n) {
        	if (nums1[i] > nums2[j]) {
        		if (m > 0) {
        			slideNumbers(nums1, i);
        		}        		
        		nums1[i] = nums2[j];
        		j++;   
        		slideStep++;
        	} else if (i+slideStep >= m) {
        		nums1[i+slideStep] = nums2[j];
        		j++; 
        	} 
        	i++;
        }
    }
	
	private static void slideNumbers(int[] nums, int startIndex) {
		for (int i=nums.length-1; i>=startIndex; i--) {
			if (i > 0) nums[i] = nums[i-1];
		}
	}
}
