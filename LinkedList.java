package com.monocept.model;

public class LinkedList {
	private Node head;

	public void add(int i) {
		// TODO Auto-generated method stub
		if (head == null) {
			head = new Node(i);
			return;
		}
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		Node temp = new Node(i);
		current.setNext(temp);
	}

	public void display() {
		// TODO Auto-generated method stub
		Node itr = head;
		while (itr != null) {
			System.out.println(itr.getData());
			itr = itr.getNext();
		}

	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		Node itr = head;
		if (itr != null) {
			if (itr.getData() == i) {
				head = head.getNext();
				return;
			}
			while (itr.getNext() != null && itr.getNext().getData() != i)
				itr = itr.getNext();
			if (itr.getNext() != null)
				itr.setNext(itr.getNext().getNext());
		}
	}

}
