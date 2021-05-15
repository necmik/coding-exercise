package com.coding.datastructures.graphs;

import java.util.ArrayList;
import java.util.List;

class NodeR {
	String data;
	List<NodeR> children = new ArrayList<NodeR>();
	boolean visited = false;
	
	void print() {
		NodeR root = this;
		print(root);
	}
	
	void print(NodeR node) {
		System.out.println(node.data);
		for (NodeR child : node.children) {
			if (!child.visited) {
				print(child);
				child.visited = true;
			}
		}
	}
}

public class GraphRoute {
	
	public static void main(String[] args) {
		NodeR graph = new NodeR();
		graph.data = "A";
		
		NodeR child1 = new NodeR();
		child1.data = "B";
		graph.children.add(child1);
		
		NodeR child2 = new NodeR();
		child2.data = "C";
		graph.children.add(child2);
		
		NodeR child3 = new NodeR();
		child3.data = "D";
		child1.children.add(child3);
		
		NodeR child4 = new NodeR();
		child4.data = "E";
		child4.children.add(graph);
		
		NodeR child5 = new NodeR();
		child5.data = "F";
		child5.children.add(child2);
		
		System.out.println(haveRoute(graph, child3));
	}
	
	private static boolean haveRoute(NodeR source, NodeR dest) {
		boolean result = source.data.equals(dest.data);
		if (result) {
			return true;
		} else {
			for (NodeR child : source.children) {
				if (!child.visited) {
					child.visited = true;
				}
				if (haveRoute(child, dest)) return true;
			}
		}
		return false;
	}
}
