package com.coding.datastructures;

import java.util.Arrays;

public class ZeroMatrix {

	public static void main(String[] args) {
		int[][] matrix = new int[3][];
		matrix[0] = new int[2];
		matrix[0][0] = 1;
		matrix[0][1] = 0;
		
		matrix[1] = new int[4];
		matrix[1][0] = 1;
		matrix[1][1] = 1;
		matrix[1][2] = 0;
		matrix[1][3] = 2;
		
		matrix[2] = new int[4];
		matrix[2][0] = 1;
		matrix[2][1] = 1;
		matrix[2][2] = 1;
		matrix[2][3] = 2;
		
		print(matrix);
		
		int[][] newMatrix = setZeros(matrix);
		print(newMatrix);
	}
	
	private static void print(int[][] matrix) {
		for (int i=0; i<matrix.length; i++) {
			for (int j =0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	static int[][] setZeros(int[][] matrix) {
		int[][] newMatrix = deepCopy(matrix); 
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					fillZero(newMatrix, i, j);
				}
			}
		}
		
		return newMatrix;
	}
	
	public static int[][] deepCopy(int[][] original) {
	    if (original == null) {
	        return null;
	    }

	    final int[][] result = new int[original.length][];
	    for (int i = 0; i < original.length; i++) {
	        result[i] = Arrays.copyOf(original[i], original[i].length);
	        // For Java versions prior to Java 6 use the next:
	        // System.arraycopy(original[i], 0, result[i], 0, original[i].length);
	    }
	    return result;
	}
	
	static void fillZero(int[][] matrix, int rowNumber, int columnNumber) {
		for (int i=0; i<matrix[rowNumber].length;i++) {
			matrix[rowNumber][i] = 0;
		}
		
		for (int i=0; i<matrix.length;i++) {
			if (matrix[i].length > columnNumber)
				matrix[i][columnNumber] = 0;
		}
	}
}
