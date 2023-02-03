package com.coding.algorithms.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author necmikilic
 * Given a set with distinct elements, find all of its distinct subsets.
 *
 *	Example: Input: [1, 5, 3]
 *	Output: [], [1], [5], [3], [1,5], [1,3], [5,3], [1,5,3]
 *
 * We can use the Breadth-First Search (BFS) approach to generate all subsets of the given set. 
 * We can start with an empty set, iterate through all numbers one-by-one, and add them to existing sets to create new subsets.
 */
public class Subsets {

	public static List<List<Integer>> findSubsets(int[] nums) {
		List<List<Integer>> subsets = new ArrayList<>();
		
		// start by adding the empty subset
	    subsets.add(new ArrayList<>());
	    
	    // we will take all existing subsets and insert the current number in them to create new subsets
	    for (int currentNumber : nums) {
	        // we will take all existing subsets and insert the current number in them to
	        // create new subsets
	        int n = subsets.size();
	        for (int i = 0; i < n; i++) {
	          // create a new subset from the existing subset and 
	          // insert the current element to it
	          List<Integer> set = new ArrayList<>(subsets.get(i));
	          set.add(currentNumber);
	          subsets.add(set);
	        }
	      }
	      
		return subsets;
	}
	
	public static void main(String[] args) {
		List<List<Integer>> result = Subsets.findSubsets(new int[] { 1, 3 });
	    System.out.println("Here is the list of subsets: " + result);

	    result = Subsets.findSubsets(new int[] { 1, 5, 3 });
	    System.out.println("Here is the list of subsets: " + result);
	}
}
