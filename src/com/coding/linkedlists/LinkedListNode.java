package com.coding.linkedlists;

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
