package com.coding;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int solution(String S, int[] A) {
        if (A.length == 0) {
            return 0;
        }

        List<Vertex> list = new ArrayList<Vertex>();
        for (int i =0; i<A.length; i++) {
            Vertex vertex = new Vertex(S.charAt(i));
            list.add(vertex);
        }

        for (int i =1; i<A.length; i++) {
            Vertex parentVertex = list.get(A[i]);
            parentVertex.addEdge(list.get(i));
        }

        System.out.println(list);
        int longestPath = 0;
        
        return longestPath;
    }
	
	public static void main(String[] args) {
		String S = "abbab";
		int[] A = new int[] {-1,0,0,0,2};
		new Solution().solution(S, A);
	}
}
