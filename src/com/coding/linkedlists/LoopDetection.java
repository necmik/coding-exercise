package com.coding.linkedlists;

import java.util.HashSet;
import java.util.Set;

public class LoopDetection {

	public static void main(String[] args) {
		LinkedListNode node = new LinkedListNode();
		node.data = "A";
		LinkedListNode node1 = new LinkedListNode();
		node1.data = "B";
		node.next = node1;
		LinkedListNode node2 = new LinkedListNode();
		node2.data = "C";
		node1.next = node2;
		LinkedListNode node3 = new LinkedListNode();
		node3.data = "B";
		node2.next = node3;
		node3.next = node1;

		//node.print();
		System.out.println(hasLoop(node));
	}

	static LinkedListNode hasLoop(LinkedListNode node) {
		if (null == node)
			return null;
		Set<LinkedListNode> nodeSet = new HashSet<LinkedListNode>();
		while (node != null) {
			if (nodeSet.contains(node))
				return node;
			nodeSet.add(node);
			node = node.next;
		}
		return null;
	}
}
