package com.defect.numberoperations;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalRound {
	
	public static void main(String[] args) {
		System.out.println(roundPrice(new BigDecimal("842.856299475")));
		System.out.println(roundPrice(new BigDecimal("1.33")));
		System.out.println(roundPrice(new BigDecimal("842.85")));
		System.out.println(roundPrice(new BigDecimal("842.811")));
		System.out.println(roundPrice(new BigDecimal("2")));
	}
	
	private static BigDecimal roundPrice(BigDecimal price) {
		
		double roundDouble = Math.floor((price.doubleValue() + 0.04) * 20)/20.0;
		return BigDecimal.valueOf(roundDouble).stripTrailingZeros();
		
		/*
		BigInteger bg = price.multiply(BigDecimal.valueOf(100L)).toBigInteger();
		int mod = bg.mod(BigInteger.valueOf(10L)).intValue();
		
		if (mod == 0 | mod == 5) {
			return new BigDecimal(bg).divide(BigDecimal.valueOf(100L));
		}
			
		int roundValue = 0;
		if (mod<5) {
			roundValue = 5-mod;
		} else {
			roundValue = 10-mod;
		}
		bg = bg.add(BigInteger.valueOf(roundValue));
		BigDecimal newPrice = new BigDecimal(bg).divide(BigDecimal.valueOf(100L));
		return newPrice;
		*/
	}

}
