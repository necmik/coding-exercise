package com.coding.toptal;

public class Algorithm1 {
	public static int solution(String S) {
        // write your code in Java SE 8
		int returnK = 0;
		if (null == S) return 0;
        char[] charArray = S.toCharArray();
        for (int i=0; i<charArray.length; i++) {
        	int total1 = 0;
        	for (int j=0; j<=i;j++) {
        		if (charArray[j] == '(') total1 += 1;
        	}
        	int total2 = 0;
        	for (int k=i+1; k<charArray.length;k++) {
        		if (charArray[k] == ')') total2 += 1;
        	}
        	
        	if (total1 == total2) {
        		returnK = i+1;
        		break;
        	}
        }
        return returnK;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("(())))("));
		System.out.println(solution("(()))("));
		System.out.println(solution(""));
	}
	
}
