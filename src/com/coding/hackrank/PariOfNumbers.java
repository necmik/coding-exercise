package com.coding.hackrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PariOfNumbers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Integer total = null;
		List<Integer> numberList = new ArrayList<Integer>();
		while (reader.hasNextLine()) {
			String lineNew = reader.nextLine();
			if (lineNew.isEmpty()) {
                break;
            }
			
			if (total == null) {
				total = reader.nextInt();
				continue;
			}
			numberList.add(reader.nextInt());
		}
		
		for (int i=0; i<numberList.size();i++) {
			for (int j=i+1; j<numberList.size(); j++) {
				if (total == (numberList.get(i) + numberList.get(j))) {
					System.out.println("1");
					return;
				}
			}
		}
		System.out.println("0");
	}
}
