package com.coding.datastructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RetainAllTest {
	
	public static void main(String[] args) {
		
		Set<String> strSet = new HashSet<String>();
		strSet.add("A");
		strSet.add("B");
		strSet.add("C");
		strSet.add("D");
		strSet.add("E");
		strSet.add("F");
		
		List<String> strList = new ArrayList<String>();
		strList.add("A");
		strList.add("B");
		strList.add("G");
		
		strSet.retainAll(strList);
		
		System.out.println(strSet);
	}

}
