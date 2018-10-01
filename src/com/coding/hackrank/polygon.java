package com.coding.hackrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class polygon {

	public static void main(String[] args) {
		
		int squareCount =0;
		int rectangleCount = 0;
		int otherPolygonCount = 0;
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Please enter the lengths of polygons. For stopping tap enter without any text");
        String lineNew;
		while (reader.hasNextLine()) {
			lineNew = reader.nextLine();
            if (lineNew.isEmpty()) {
                break;
            }
            String[] splittedShape = lineNew.split(" ");
            if (Integer.valueOf(splittedShape[0]) < 0 
               || Integer.valueOf(splittedShape[1]) < 0
               || Integer.valueOf(splittedShape[2]) < 0
               || Integer.valueOf(splittedShape[3]) < 0) {
                otherPolygonCount++;
                continue;
            }
            if (splittedShape[0].equals(splittedShape[1]) && splittedShape[1].equals(splittedShape[2]) && splittedShape[2].equals(splittedShape[3])) {
				 squareCount++;
			 } else if (splittedShape[0].equals(splittedShape[2]) && splittedShape[1].equals(splittedShape[3])) {
				 rectangleCount++;
			 } else {
				 otherPolygonCount++;
			 }
            
		}
		
		 System.out.println(squareCount + " " + rectangleCount + " " + otherPolygonCount);
	}
}
