package com.coding.datastructures.stackqueues;

import com.coding.datastructures.Node;

public class QueueLinkedList {

	Node front, rear;

	public QueueLinkedList() {
		this.front = null;
		this.rear = null;
	}

	void enqueue(int key) {
		Node temp = new Node(key);
		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}
		this.rear.setNext(temp);
		this.rear = temp;
	}

	Node dequeue() {
		if (this.front == null)
			return null;
		Node temp = this.front;
		this.front = this.front.getNext();
		if (this.front == null)
			this.rear = null;
		return temp;
	}

	public static void printList(QueueLinkedList list) {
		Node currentNode = list.front;
		System.out.print("Linked List Elements: ");
		while (currentNode != null) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		QueueLinkedList q = new QueueLinkedList();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		printList(q);
		System.out.println("Dequeued item is " + q.dequeue().getData());
		printList(q);
	}

}
