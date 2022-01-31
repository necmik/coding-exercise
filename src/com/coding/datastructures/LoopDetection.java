package com.coding.datastructures;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author necmikilic
 *Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the
beginning of the loop.
DEFINITION
Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so
as to make a loop in the linked list.
EXAMPLE
Input: A -) B -) C -) 0 -) E - ) C[thesameCasearlierl
Output: C
 */
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
		node3.data = "D";
		node2.next = node3;
		node3.next = node1;

		//node.print();
		LinkedListNode loop = hasLoop(node);
		if (loop != null) {
			System.out.println(hasLoop(node).data);
		} else {
			System.out.println("No loop");
		}
		
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
