package com.coding.numberoperations;

import java.math.BigDecimal;

public class NumberRounding {

	public static void main(String[] args) {
		System.out.println(roundIt(new BigDecimal(10.0988)));
		System.out.println(roundIt(new BigDecimal(100.0912)));
		System.out.println(roundIt(new BigDecimal(1.2333333)));
		System.out.println(roundIt(new BigDecimal(1.2103333)));
	}
	
	private static BigDecimal roundIt(BigDecimal num) {
		return num.setScale(2, BigDecimal.ROUND_UP);
	}
}
