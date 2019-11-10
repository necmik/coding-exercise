package com.coding.datastructures;

import java.util.HashSet;
import java.util.Set;

public class LinkedListRemoveDuplicates {
	
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
		
		node.print();
		removeDuplicates(node);
		node.print();
		removeMiddleNode(node);
		node.print();
	}
	
	private static void removeDuplicates(LinkedListNode node) {
		Set<String> valueSet = new HashSet<String>();
		LinkedListNode previous = null;
		while (node != null) {
			if (valueSet.contains(node.data)) {
				previous.next = node.next;
			} else {
				previous = node;
				valueSet.add(node.data);
			}
			node = node.next;
		}
	}
	
	private static boolean removeMiddleNode(LinkedListNode node) {
		if (node == null || node.next == null) return false;
		
		LinkedListNode next = node.next;
		node.next = next.next;
		return true;
	}

}
