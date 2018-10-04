package com.coding.recursive;

import java.util.ArrayList;
import java.util.HashSet;

public class RobotInAGrid {

	public static void main(String[] args) {
		boolean[][] maze = new boolean[5][4];
		for (int i=0; i<maze.length; i++) {
			for (int j=0; j<maze[i].length; j++) {
				maze[i][j] = true;
			}
		}
		maze[1][0] = false;
		maze[3][1] = false;
		maze[3][2] = false;
		maze[4][2] = false;
		
		ArrayList<Point> path = getPath(maze);
		if (path != null) {
			for (Point p : path) {
				System.out.println("(" + p.coordX + "," + p.coordY + "),");
			}
		} else {
			System.out.println("No path");
		}
	}
	
	static ArrayList<Point> getPath(boolean[][] maze) {
		if (maze == null || maze.length == 0) return null;
		ArrayList<Point> path = new ArrayList<>();
		HashSet<Point> failedPoints = new HashSet<>();
		if (getPath(maze, maze.length-1, maze[0].length -1, path, failedPoints)) {
			return path;
		}
		return null;
	}
	static boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path, HashSet<Point> failedPoints) {
		/* If out of bounds or not available, return */
		if (col<0 || row < 0 || !maze[row][col]) {
			return false;
		}
		
		Point p = new Point(row, col);
		
		/*If we already visited this cell, return */
		if (failedPoints.contains(p)) {
			return false;
		}
		
		boolean isAtOrigin = (row ==0) && (col == 0);
		
		/*If there2s a path from start to  my current location, add my location. */
		if (isAtOrigin || getPath(maze, row, col-1, path, failedPoints) ||
				getPath(maze, row-1, col, path, failedPoints)) {
			path.add(p);
			return true;
		}
		return false;
	}
}
