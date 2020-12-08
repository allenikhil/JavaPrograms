package com.java.linkedlist;

import java.util.LinkedList;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * LinkedList list=new LinkedList(); list.insert(20); list.insert(23);
		 * list.insert(40); list.insertAtStart(50); list.insertAt(2,10); list.show();
		 * list.deleteAt(3); list.show();
		 * System.out.println("Size of Singly Linked List:"+list.size());
		 */
		
		TestLinkedList list1=new TestLinkedList();
		list1.insertAtStart(20);
		list1.insertAtStart(23);
		list1.insertAtStart(40);
		list1.insertAtStart(50);
		list1.insertAtStart(2);
		list1.print();
		System.out.println("Size of Singly Linked List:"+list1.size());
		System.out.println("Singly Linked List:"+list1);
		
		LinkedList<String> lnlist=new LinkedList<String>();
		lnlist.addAll(0, lnlist);
		System.out.println(lnlist.peek());
		
	}

}
