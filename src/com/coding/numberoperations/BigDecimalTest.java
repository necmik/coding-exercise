package com.coding.numberoperations;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String[] args) {
		String daValue = "12.94";
		System.out.println(new BigDecimal(daValue));
		
		BigDecimal coefficient = new BigDecimal("5.1");
		BigDecimal daValueCalculated = new BigDecimal(daValue).divide(coefficient, 2);
		System.out.println(daValueCalculated);
		System.out.println(String.valueOf(daValueCalculated));
		
		Integer daValueCalculatedInt = new BigDecimal(daValue).divide(coefficient, 2).intValue();
		System.out.println(daValueCalculatedInt);
	}
}
