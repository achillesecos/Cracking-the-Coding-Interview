package StacksQueues;

import java.util.EmptyStackException;

public class Stack {
	private static class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	private Node top;
	
	public boolean  isEmpty() {
		return top == null;
	}
	
	public int peek()	 {
		if(top == null) throw new EmptyStackException();
		return top.data;
	}
	
	public void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	}
	
	public int pop() {
		if(top == null) throw new EmptyStackException();
		int item = top.data;
		top = top.next;
		return item;
	}

	public Stack() {
		// TODO Auto-generated constructor stub
	}

}
