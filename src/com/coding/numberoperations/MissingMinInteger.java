package com.coding.numberoperations;

import java.util.Arrays;

public class MissingMinInteger {

	public int solution(int[] A) {
		Arrays.sort(A);
		
		int min = 1;
		for (int a : A) {
			if (a < 0) {
				continue;
			}
			if (a != min) {
				break;
			}
			min++;
		}
		
		return min;
    }
	
	public static void main(String[] args) {
		MissingMinInteger s = new MissingMinInteger();
		System.out.println(s.solution(new int[]{}));
		System.out.println(s.solution(new int[]{-1}));
		System.out.println(s.solution(new int[]{-1,-3}));
		System.out.println(s.solution(new int[]{1,1}));
		System.out.println(s.solution(new int[]{1,3,4,}));
		System.out.println(s.solution(new int[]{3}));
		System.out.println(s.solution(new int[]{1,2,3,6,-1}));
	}
	
}
