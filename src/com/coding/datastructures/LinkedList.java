package com.coding.datastructures;

public class LinkedList {

	Node head;
	
	public static LinkedList insert(LinkedList list, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node lastNode = list.head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}
		
		return list;
	}
	
	public static LinkedList deleteByKey(LinkedList list, int key) {
		System.out.println();
		System.out.println("Delete element " + key + " from LinkedList");
		
		Node currentNode = list.head, previousNode = null;
		if (currentNode != null && currentNode.data == key) {
			list.head = currentNode.next;
			System.out.println(key + " found and deleted");
			return list;
		}
		
		while (currentNode != null && currentNode.data != key) {
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		
		if (currentNode != null) {
			previousNode.next = currentNode.next;
			System.out.println(key + " found and deleted");
		}
		
		if (currentNode == null) {
			System.out.println(key + " not found");
		}
		
		return list;
	}
}
