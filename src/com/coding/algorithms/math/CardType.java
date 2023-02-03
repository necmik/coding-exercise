package com.coding.algorithms.math;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

class Result {

    static int minLength = Integer.MAX_VALUE;
    /**
     * An entity to hold bin range details. A bin range is a pair of 12 digit numbers that 
     * mark the boundaries of the range which is maped to other bin range properties such
     * as a card type. The range boundaries are inclusive.
     */
    static final class BinRange {
        final String start;
        final String end;
        final String cardType;

        BinRange(String start, String end, String cardType) {
            this.start = start;
            this.end = end;
            this.cardType = cardType;
        }        
    }

    interface CardTypeCache {
        /**
         * @param cardNumber 12 to 23 digit card number.
         * 
         * @return the card type for this cardNumber or null if the card number does not
         *      fall into any valid bin ranges.
         */
        String get(String cardNumber);
    }
    
    /**
     * @param binRanges the list of card bin ranges to build a cache from.
     *
     * @return an implementation of CardTypeCache.
     */
    public static CardTypeCache buildCache(List<BinRange> binRanges) {
        /** 
         * Build a cache by using TreeMap. Set the start as key.
         * By using TreeMap, it would be easier to find range of the cardNumber with its start value. 
        */
        TreeMap<String, BinRange> binCache = new TreeMap<>();
        for (BinRange binRange : binRanges) {            
            binCache.put(binRange.start, binRange);
            minLength = Math.min(minLength, binRange.start.length());
        }
        
        return new CardTypeCache() {
            public String get(String cardNumber) {
                String cardNumberSub = cardNumber.substring(0, minLength);
                String floorKey = binCache.floorKey(cardNumberSub);
                String ceilKey = binCache.ceilingKey(cardNumberSub);
                
                System.out.println("floorKey: " + floorKey);
                // Firstly check floor key. If the start is below the minimum key value of the cache, check the ceil key.
                if (floorKey != null) {
                    BinRange bin = binCache.get(floorKey);
                    if (isBinMatch(cardNumberSub, bin)) {
                        return bin.cardType;
                    }
                }
                
                System.out.println("ceilKey: " + ceilKey);
                if (ceilKey != null) {
                    BinRange bin = binCache.get(ceilKey);
                    if (isBinMatch(cardNumberSub, bin)) {
                        return bin.cardType;
                    }
                }
                
                return null;
            }
            
            boolean isBinMatch(String cardNo, BinRange binRange) {
                // If the cardNumber is between the range of the bin, it matches with it. 
                return cardNo.compareTo(binRange.start) >= 0 
                    && cardNo.compareTo(binRange.end) <= 0;
            }
        };        
    }
}

public class CardType {
	
	public static void main(String[] args) throws IOException {
		List<Result.BinRange> binRanges = 
			Arrays.asList(new Result.BinRange("4444 4444 11", "4444 4444 44", "Visa credit"),
					new Result.BinRange("4500 0000 55", "4999 9999 00", "Visa debit"),
					new Result.BinRange("4999 9999 99", "5555 0000 00", "Master credit"),
					new Result.BinRange("6666 4444 11", "7777 0000 00", "Amex")
			);	

        Result.CardTypeCache cache = Result.buildCache(binRanges);
        System.out.println(cache.get("4500 0000 99"));
        System.out.println(cache.get("6666 4444 99"));
        System.out.println(cache.get("4444 4444 00"));
            
    }
}
