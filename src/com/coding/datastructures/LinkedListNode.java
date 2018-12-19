package com.coding.datastructures;

class LinkedListNode {
	String data;
	LinkedListNode next;
	
	protected void print() {
		LinkedListNode node = this;
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
}
