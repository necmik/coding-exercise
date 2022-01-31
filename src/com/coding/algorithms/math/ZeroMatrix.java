package com.coding.algorithms.math;

import java.util.ArrayList;
import java.util.List;

public class ZeroMatrix {

	static int[][] zeroMatrix(int[][] matrix) {
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		int[][] zeroMatrix = new int[m][n];		
		List<Integer> zeroXList = new ArrayList<>();
		List<Integer> zeroYList = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			for (int j=0; j < n; j++) {
				// collect indexes of zeros
				if (matrix[i][j] == 0) {
					zeroXList.add(i);
					zeroYList.add(j);
				}
			}
		}
		
		// populate new matrix
		// if the coord is included in zero set cell as 0
		// otherwise set cell as orijinal matrix value
		for (int i = 0; i < m; i++) {
			for (int j=0; j < n; j++) {
				if (zeroXList.contains(i) || zeroYList.contains(j)) {
					zeroMatrix[i][j] = 0;
				} else {
					zeroMatrix[i][j] = matrix[i][j];
				}
			}
		}
		
		
		return zeroMatrix;
	}
		
	static void printMatrix(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		
		for (int i = 0; i < m; i++) {
			for (int j=0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		int[][] matrix = new int[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j=0; j < 4; j++) {
				matrix[i][j] = i+j+31;
			}
		}
		
		matrix[2][3] = 0;
		matrix[1][1] = 0;
		
		System.out.println("Before");
		printMatrix(matrix);
		System.out.println("--------------");
		
		int[][] newMatrix = zeroMatrix(matrix);
		System.out.println("After");
		printMatrix(newMatrix);
		
	}
}

