package com.coding.mapoperations;

import java.util.HashMap;
import java.util.Map;

public class MapKeyExistance {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("AA", "11");
		map.put("BB", "22");
		map.put("BB", "33");
		
		System.out.println(map.get("AA"));
		System.out.println(map.get("BB"));
		System.out.println(map.get("CC"));
	}
}
