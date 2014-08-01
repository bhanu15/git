package com.bhanu.Trees;

public interface ITree {
	void add(Node node, int data);
	void traverseInorder(Node node);
	void traversePostOrder(Node node);
}
