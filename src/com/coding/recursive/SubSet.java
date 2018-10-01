package com.coding.recursive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubSet {
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(3);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		
		System.out.println(getSubsets(set));
	}
	
	private static List<Set<Integer>> getSubsets(Set<Integer> source) {
		List<Set<Integer>> subsets = new ArrayList<Set<Integer>>();
		
		while(source.size() > 0) {
			List<Integer> list = new ArrayList<>(source);
			Set<Integer> subSet = new HashSet<>(list.subList(0, source.size()-1));
			subsets.add(subSet);
			source = subSet;
		}
		return subsets;
	}

}
