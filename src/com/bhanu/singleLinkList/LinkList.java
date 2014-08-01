package com.bhanu.singleLinkList;

public class LinkList implements ILinkList{
	public void add(Node head, int number){
		while(head.left != null){
			head = head.left;
		}
		head.left = new Node(number);
	}

	public void display(Node node){
		while(node != null){
			System.out.println(node.number);
			node = node.left;
		}
	}
	public void traverseList(Node node){
		if(node != null){
			System.out.println(node.number);
			traverseList(node.left);
		}
	}

	@Override
	public void reverse(Node node) {
		// TODO to implement reverse 
		
	}
}
