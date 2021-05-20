package com.coding.stringoperations;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternValidation {

	public static void main(String[] args){
		try (Scanner in = new Scanner(System.in)) {
			int testCases = Integer.parseInt(in.nextLine());
			while(testCases-->0){
				String reg = in.nextLine();
	            try {
	                Pattern pattern = Pattern.compile(reg); 
	                System.out.println("Valid");
	            } catch (PatternSyntaxException e) {
	                System.out.println("Invalid");
	            }
			}
		}
	}
}
