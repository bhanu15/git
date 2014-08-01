package com.bhanu.singleLinkList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node head = new Node(5);
		ILinkList linklist = new LinkList();
		linklist.add(head, 15);
		linklist.add(head, 25);
		linklist.add(head, 35);
		linklist.add(head, 45);
		linklist.display(head);
		
		System.out.println("<--- TraverList --->");
		linklist.traverseList(head);

	}

}
