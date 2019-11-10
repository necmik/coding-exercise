package com.coding.datastructures;

import java.util.ArrayList;
import java.util.List;

class Node {
	String data;
	List<Node> children = new ArrayList<Node>();
	boolean visited = false;
	
	void print() {
		Node root = this;
		print(root);
	}
	
	void print(Node node) {
		System.out.println(node.data);
		for (Node child : node.children) {
			if (!child.visited) {
				print(child);
				child.visited = true;
			}
		}
	}
}

public class GraphRoute {
	
	public static void main(String[] args) {
		Node graph = new Node();
		graph.data = "A";
		
		Node child1 = new Node();
		child1.data = "B";
		graph.children.add(child1);
		
		Node child2 = new Node();
		child2.data = "C";
		graph.children.add(child2);
		
		Node child3 = new Node();
		child3.data = "D";
		child1.children.add(child3);
		
		Node child4 = new Node();
		child4.data = "E";
		child4.children.add(graph);
		
		Node child5 = new Node();
		child5.data = "F";
		child5.children.add(child2);
		
		System.out.println(haveRoute(graph, child3));
	}
	
	private static boolean haveRoute(Node source, Node dest) {
		boolean result = source.data.equals(dest.data);
		if (result) {
			return true;
		} else {
			for (Node child : source.children) {
				if (!child.visited) {
					child.visited = true;
				}
				if (haveRoute(child, dest)) return true;
			}
		}
		return false;
	}
}
