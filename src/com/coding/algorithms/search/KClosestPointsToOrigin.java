package com.coding.algorithms.search;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 
 * @author necmikilic
 *
 * Given an array of points in a 2D plane, find K closest points to the origin.
 * Example: Input: points = [[1,2],[1,3]], K = 1, Output: [[1,2]]
 */

class Point {
  int x;
  int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int distFromOrigin() {
    // ignoring sqrt
    return (x * x) + (y * y);
  }
}

public class KClosestPointsToOrigin {

	public static List<Point> findClosestPoints(Point[] points, int k) {
		
		PriorityQueue<Point> maxHeap = new PriorityQueue<>(
	              (p1, p2) -> p2.distFromOrigin() - p1.distFromOrigin());
		
		// Add first k points to heap
		for (int i = 0; i<k; i++)
			maxHeap.add(points[i]);
		
			// Go through the remaining points of the input array, if a point is closer to 
		    // the origin than the top point of the max-heap, remove the top point from 
		    // heap and add the point from the input array
			for (int i=k; i<points.length; i++) {
				
				if (points[i].distFromOrigin() < maxHeap.peek().distFromOrigin()) {
					maxHeap.poll(); // Remove the head node
					maxHeap.add(points[i]);
				}
			}
		
		// the heap has 'k' points closest to the origin, return them in a list
	    return new ArrayList<>(maxHeap);
	}
	
	
	public static void main(String[] args) {
		Point[] points = new Point[] { new Point(1, 3), new Point(3, 4), new Point(2, -1) };
	    List<Point> result = KClosestPointsToOrigin.findClosestPoints(points, 2);
	    System.out.print("Here are the k points closest the origin: ");
	    for (Point p : result)
	      System.out.print("[" + p.x + " , " + p.y + "] ");
	}
}
