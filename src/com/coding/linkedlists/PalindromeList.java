package com.coding.linkedlists;


class LinkedListNode2 {
	int data;
	LinkedListNode2 next;
	
	protected void print() {
		LinkedListNode2 node = this;
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
}

public class PalindromeList{

	public static void main(String[] args) {
		LinkedListNode2 node = new LinkedListNode2();
		LinkedListNode2 head = node;
		node.data = 0;
		LinkedListNode2 next = new LinkedListNode2();
		next.data = 1;
		node.next = next;
		node = next;
		next = new LinkedListNode2();
		next.data = 2;
		node.next = next;
		node = next;
		next = new LinkedListNode2();
		next.data = 1;
		node.next = next;
		node = next;
		next = new LinkedListNode2();
		next.data = 0;
		node.next = next;
		node = next;
		
		head.print();
		
		System.out.println(isPalindrom(head));
		
	}
	
	static boolean isPalindrom(LinkedListNode2 node) {
		if (node == null) return false;
		LinkedListNode2 reverse = reverseList(node);
		while(node != null) {
			if (node.data != reverse.data) return false;
			
			node = node.next;
			reverse = reverse.next;
		}
		//reverse.print();
		return true;
	}
	
	static LinkedListNode2 reverseList(LinkedListNode2 node) {
		LinkedListNode2 reverse = null;
		
		while(node != null) {
			LinkedListNode2 newNode = new LinkedListNode2();
			newNode.data = node.data;
			newNode.next = reverse;
			reverse = newNode;
			node = node.next;
		}
		return reverse;
	}
}
