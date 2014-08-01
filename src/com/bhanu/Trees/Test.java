package com.bhanu.Trees;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(5);
		ITree tree = new Tree();
		tree.add(node, 15);
		tree.add(node, 4);
		tree.add(node, 1);
		tree.add(node, 7);
		tree.add(node, 17);
		tree.add(node, 11);
		tree.traverseInorder(node);
		System.out.println("<---- Post order starts---->");
		tree.traversePostOrder(node);
	}

}
