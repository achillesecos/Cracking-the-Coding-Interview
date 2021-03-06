package StacksQueues;

import java.util.NoSuchElementException;

public class Queue {
	private static class Node{
		private int data;
		private Node next;
		private Node(int data) {
			this.data = data;
		}
	}
	
	private Node head;
	private Node tail;
	
	private boolean isEmpty() {
		return head == null;
	}
	
	public int peek() {
		if(head == null) throw new NoSuchElementException();
		return head.data;
	}
	
	public void add(int data) {
		Node node = new Node(data);
		if(tail != null) {
			tail.next = node;
		}	
		tail = node;
		if(head == null) {
			head = node;
		}
	}
	
	public int remove() {
		if(head == null) throw new NoSuchElementException();
		int data = head.data;
		head = head.next;
		if(head == null) {
			tail = null;
		}
		return data;
	}
	
	public Queue() {
		// TODO Auto-generated constructor stub
	}
}
