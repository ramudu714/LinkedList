package com.monocept.test;

import com.monocept.model.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		
		list.display();
		list.remove(10);
		list.remove(40);
		list.remove(80);
		list.display();
		
	}

}
