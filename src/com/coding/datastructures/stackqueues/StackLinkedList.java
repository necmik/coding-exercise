package com.coding.datastructures.stackqueues;

import com.coding.datastructures.Node;

public class StackLinkedList {
	private Node first = null;

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.setNext(first);
		first = newNode;
	}

	public void pop() {
		Node temp = first;
		first = first.getNext();
		System.out.println("Removed element Elements: " + temp.getData());
	}

	public static void printList(StackLinkedList list) {
		Node currentNode = list.first;
		System.out.print("Linked List Elements: ");
		while (currentNode != null) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StackLinkedList list = new StackLinkedList();
		list.push(4);
		list.push(6);
		list.push(1);
		printList(list);
		list.pop();
		printList(list);
	}

}
