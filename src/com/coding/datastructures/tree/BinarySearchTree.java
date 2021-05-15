package com.coding.datastructures.tree;

public class BinarySearchTree {

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	public Node search(Node root, int key) {
		if (root == null || root.key == key) {
			return root;
		}

		if (key < root.key) {
			return search(root.left, key);
		}

		return search(root.right, key);
	}

	void insertNode(int key) {
		root = insertHelper(root, key);
	}

	Node insertHelper(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key) {
			root.left = insertHelper(root.left, key);
		} else if (key > root.key) {
			root.right = insertHelper(root.right, key);
		}
		return root;
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insertNode(8);
		tree.insertNode(4);
		tree.insertNode(1);
		tree.insertNode(7);
		tree.insertNode(12);
		tree.insertNode(9);
		tree.insertNode(14);
		
		System.out.println("Data you are looking for ::" + tree.search(tree.root, 14).key);

	}
}
