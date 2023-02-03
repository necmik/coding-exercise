package com.coding.algorithms.math;

/*
 * You are climbing a staircase. It takes n steps to reach the top.

	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbStairs {
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
		System.out.println(climbStairs3(5));
	}
	
	public static int climbStairs(int n) {
	  // Similar to fibonacci
      int[] dp = new int[n+1];
      dp[0] = 1;
      dp[1] = 1;
      for (int i=2; i<=n; i++) {
    	  dp[i] = dp[i-1] + dp[i-2];
      }
      
      return dp[n];
    }
	
	public static int climbStairs3(int n) {
		  // Similar to fibonacci
	      int[] dp = new int[n+1];
	      dp[0] = 1;
	      dp[1] = 1;
	      dp[2] = 2;
	      for (int i=3; i<=n; i++) {
	    	  dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
	      }
	      
	      return dp[n];
	    }

}
