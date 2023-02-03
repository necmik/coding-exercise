/**
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.

  The distance between two adjacent cells is 1.
 */
package com.coding.algorithms.math;

import java.util.Arrays;

public class MatrixDistance0 {

	 public static int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length, INF = m + n; // The distance of cells is up to (M+N)
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (mat[r][c] == 0) continue;
                int top = INF, left = INF;
                if (r - 1 >= 0) top = mat[r - 1][c];
                if (c - 1 >= 0) left = mat[r][c - 1];
                mat[r][c] = Math.min(top, left) + 1;
            }
        }
        for (int r = m - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                if (mat[r][c] == 0) continue;
                int bottom = INF, right = INF;
                if (r + 1 < m) bottom = mat[r + 1][c];
                if (c + 1 < n) right = mat[r][c + 1];
                mat[r][c] = Math.min(mat[r][c], Math.min(bottom, right) + 1);
            }
        }
        return mat;
    }
	 
	 public static void main(String[] args) {
		int[][] matrix = new int[][] {{0,0,0},{0,1,0},{0,0,0}};
		for (int[] row: matrix) {
			System.out.println(Arrays.toString(row));
		}
		
		System.out.println("------------");
		int[][] newMatrix = updateMatrix(matrix);
		for (int[] row: newMatrix) {			
			System.out.println(Arrays.toString(row));
		}
		
		matrix = new int[][] {{0,0,0},{0,1,0},{1,1,1}};
		for (int[] row: matrix) {
			System.out.println(Arrays.toString(row));
		}
		
		System.out.println("------------");
		newMatrix = updateMatrix(matrix);
		for (int[] row: newMatrix) {			
			System.out.println(Arrays.toString(row));
		}
		
	}
	 
}
