package com.coding.datastructures.stackqueues;

import java.util.EmptyStackException;

public class MyStack<T> {

	private static class StackNode<T> {
		T data;
		StackNode<T> nextNode;
		
		StackNode(T data) {
			this.data = data;
		}
	}
		
	private StackNode<T> top;
	
	public T pop() {
		if (top == null) throw new EmptyStackException();
		
		T item = top.data;
		top = top.nextNode;
		return item;
	}
		
	public T push(T data) {
		StackNode<T> newNode = new StackNode<T>(data);
		if (top == null) {
			top = newNode;
		} else {
			newNode.nextNode = top;
			top = newNode;
		}
		
		return top.data;
	}
		
	public T peek() {
		if (top == null) throw new EmptyStackException();
		
		return top.data;
	}
		
	public boolean isEmpty() {
		return top == null;
	}	
}
