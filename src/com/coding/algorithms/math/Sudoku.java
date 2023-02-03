package com.coding.algorithms.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sudoku {
	
	public static void main(String[] args) {
		Integer[][] board = {
			{8, 4, 9, 0, 0, 3, 5, 7, 0},
			{0, 1, 0, 0, 0, 0, 0, 0, 0},
			{7, 0, 0, 0, 9, 0, 0, 8, 3},
			{0, 0, 0, 9, 4, 6, 7, 0, 0},
			{0, 8, 0, 0, 5, 0, 0, 4, 0},
			{0, 0, 6, 8, 7, 2, 0, 0, 0},
			{5, 7, 0, 0, 1, 0, 0, 0, 4},
			{0, 0, 0, 0, 0, 0, 0, 1, 0},
			{0, 2, 1, 7, 0, 0, 8, 6, 5}};
		
		// ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<List<Integer>> list = (ArrayList<List<Integer>>) Arrays.stream(board)
                .map(Arrays::asList)
                .collect(Collectors.toList());
		
		System.out.println(list);
		
	    ArrayList<List<Integer>> result = solve_sudoku_puzzle(list);
	    System.out.println(result);
	}
	
	 static ArrayList<List<Integer>> solve_sudoku_puzzle(ArrayList<List<Integer>> board) {
		 int attempt = 0;
		 while(true) {
			for (int i=0; i<board.size(); i++) {
	        	for (int j=0; j<board.get(0).size(); j++) {
	        		if (board.get(i).get(j) == 0) {
	        			int cellValue = getCellValue(board, i, j);
	        			board.get(i).set(j, cellValue);
	        		}
	        	}
	        }
			
			attempt++;
			
			if (isCompleted(board)) break;
			
			if (attempt>200) {
				System.out.println("Solution not found");
				break;
			}
		}
        
        return board;
    }
	 
	 static int getCellValue(ArrayList<List<Integer>> board, int row, int column) {
		 Set<Integer> totalSet = IntStream.range(1, 10).boxed()
				 .collect(Collectors.toSet());
		
		 for (int i=0; i<board.size(); i++) {
			 totalSet.remove(board.get(row).get(i));
		 }
		 
		 for (int i=0; i<board.size(); i++) {
			 totalSet.remove(board.get(i).get(column));
		 }
		 
		 int boxRowStart = row - row % 3;
	     int boxColStart = column - column % 3;

	     for (int i = boxRowStart; i < boxRowStart + 3; i++) {
            for (int j = boxColStart; j < boxColStart + 3; j++) {
            	totalSet.remove(board.get(i).get(j));
            }
	     }
		 
		 if (totalSet.size() > 0) {
			 return totalSet.stream().findFirst().get();
		 }
		 
		 return 0;
	 }
	 
	 static boolean isCompleted(ArrayList<List<Integer>> board) {
		 for (int i=0; i<board.size(); i++) {
	        	for (int j=0; j<board.get(0).size(); j++) {
	        		if (board.get(i).get(j) == 0) {
	        			return false;
	        		}
	        	}
		 }
	     return true;
	 }

}
