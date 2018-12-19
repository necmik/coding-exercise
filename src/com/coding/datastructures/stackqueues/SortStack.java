package com.coding.datastructures.stackqueues;

import java.util.Stack;

public class SortStack {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(3);
		stack.push(-9);
		stack.push(12);
		stack.push(0);
		
		System.out.println(stack);
		Stack<Integer> sortedStack = sortStack(stack);
		System.out.println(sortedStack);
	}
	
	static Stack<Integer> sortStack(Stack<Integer> stack) {
		if (stack == null) return null;
		if (stack.isEmpty()) return new Stack<Integer>();
		
		Stack<Integer> sortedStack = new Stack<Integer>();
		
		while (!stack.isEmpty()) {
			Integer num = stack.pop();
			while(!sortedStack.isEmpty() && sortedStack.peek() > num) {
				stack.push(sortedStack.pop());
			}
			sortedStack.push(num);
		}
		return sortedStack;
	}
}
