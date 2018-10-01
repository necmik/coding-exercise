package com.coding.toptal;

public class Algorithm3 {
	public static int solution(int A, int B) {
        // write your code in Java SE 8
		int moveCount = 0;
		int maxLimit = 100000000;
		int actualX = 0;
		int actualY = 0;
		
		if (A == 0 && B == 0) return moveCount;
		while (true) {
			if (A- actualX > B - actualY) {
				actualX += 2;
				actualY += 1;
			} else {
				actualX += 1;
				actualY += 2;
			}
			moveCount++;
			if (actualX == A && actualY == B) break;
			if (actualX > A || actualY > B) {
				moveCount = -1;
				break;
			}
			if (moveCount > maxLimit) {
				moveCount = -2;
				break;
			}
		}
		
		return moveCount;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(8,10));
		System.out.println(solution(0,0));
		System.out.println(solution(900000000,900000000));
	}
}
