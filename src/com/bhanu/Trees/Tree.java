package com.bhanu.Trees;

public class Tree implements ITree{
	// this is recursion 
	public void add(Node node , int data){
		if(node.data >= data){
			if(node.left != null){
				add(node.left,data);
			}
			else{
				System.out.println("adding left"+data);
				node.left = new Node(data);
			}
		}else{
			if(node.right != null){
				add(node.right,data);}
			else{
				System.out.println("adding right"+data);
				node.right = new Node(data);
			}
		}
	}
	// this is recursion 	
	public void traverseInorder(Node node){
		if(node != null){
			traverseInorder(node.left);
			System.out.println("data"+node.data);
			traverseInorder(node.right);
		}
	}
	@Override
	public void traversePostOrder(Node node) {
		if(node != null){
			traversePostOrder(node.right);
			System.out.println(node.data);
			traversePostOrder(node.left);
		}
	}
}
