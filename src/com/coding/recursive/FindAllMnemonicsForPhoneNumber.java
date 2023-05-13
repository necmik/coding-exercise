package com.coding.recursive;

import java.util.ArrayList;
import java.util.List;

public class FindAllMnemonicsForPhoneNumber {
		// Array of string to represent a phone keypad map
		private static String[] KEY_MAPPING = new String[] {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		static Integer cnt = 0;
		
		/**
		 * Recursively find all the mnemonics for a given phone number.
		 * 
		 * Time Complexity: O(n (4^n))
		 */
		public static List<String> getAllMnemonics(String phoneNumber) {
			if(phoneNumber == null) {
				return null;
			}
			
			char[] partialMnemonic = new char[phoneNumber.length()]; 
			int phoneNumberDigitCount = 0;
			List<String> allMnemonics = new ArrayList<>();
						
			allMnemonicsFinder(phoneNumber, partialMnemonic, phoneNumberDigitCount, allMnemonics);
			System.out.println("Mnemonic count:" + cnt);
			return allMnemonics;
		}
		
		private static void allMnemonicsFinder(String phoneNumber, char[] partialMnemonics, int digitCount, List<String> allMnemonics) {
			if(digitCount == phoneNumber.length()) {
				allMnemonics.add(new String(partialMnemonics));
				cnt++;
				return;
			}
			for(int i = 0; i < KEY_MAPPING[phoneNumber.charAt(digitCount) - '0'].length(); i++) {
				char c = KEY_MAPPING[phoneNumber.charAt(digitCount) - '0'].charAt(i);
				partialMnemonics[digitCount] = c;
				allMnemonicsFinder(phoneNumber, partialMnemonics, digitCount + 1, allMnemonics);
			}
		}

		public static void main(String[] args) {
			final String phoneNumber = "530";
			List<String> mnemonics = getAllMnemonics(phoneNumber);
			System.out.println("Number of mnemonics for phone number " + phoneNumber + " is: " + mnemonics.size());
			System.out.println("All mnemonics for phone number " + phoneNumber + " is:");
			for(String word : mnemonics) {
				System.out.print(word + " ");
			}
		}
}
