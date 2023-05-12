package com.coding.algorithms.search;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearch {
	
	@SuppressWarnings("unchecked")
	static class Graph {
	    private int vertexCount; // No. of vertices
	 
	    // Array  of lists for
	    // Adjacency List Representation
	    private LinkedList<Integer> adj[];
	 
	    // Constructor
	    Graph(int v)
	    {
	        vertexCount = v;
	        adj = new LinkedList[v];
	        for (int i = 0; i < v; ++i)
	            adj[i] = new LinkedList<Integer>();
	    }
	 
	    // Function to add an edge into the graph
	    void addEdge(int v, int w)
	    {
	        adj[v].add(w); // Add w to v's list.
	    }
	 
	    // A function used by DFS
	    void DFSUtil(int v, boolean visited[])
	    {
	        // Mark the current node as visited and print it
	        visited[v] = true;
	        System.out.print(v + " ");
	 
	        // Recur for all the vertices adjacent to this vertex
	        Iterator<Integer> i = adj[v].listIterator();
	        while (i.hasNext()) {
	            int n = i.next();
	            if (!visited[n])
	                DFSUtil(n, visited);
	        }
	    }
	 
	    // The function to do DFS traversal.
	    void DFS(int v)
	    {
	        boolean visited[] = new boolean[vertexCount];
	 
	        DFSUtil(v, visited);
	    }
	 
	}

    public static void main(String args[])
    {
        Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println(
            "Following is Depth First Traversal (starting from vertex 2)");
 
        // Function call
        g.DFS(2);
    }
}
