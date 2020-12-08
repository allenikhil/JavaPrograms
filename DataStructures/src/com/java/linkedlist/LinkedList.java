package com.java.linkedlist;

public class LinkedList {
	Node head;

	public void insertAtStart(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void insertAt(int index, int data) {
		Node newNode = new Node(data);
		Node CurrentNode = head;
		if (index == 0) {
			insertAtStart(data);
		} else {
			for (int i = 0; i < index - 1; i++) {
				if(CurrentNode!=null)
				CurrentNode = CurrentNode.next;
			}
			if (CurrentNode == null) {
				System.out.println(data + " value not inserted because "+index+" is out of index");
			} else {
				newNode.next = CurrentNode.next;
				CurrentNode.next = newNode;
			}
		}
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node CurrentNode = head;
			while (CurrentNode.next != null) {
				CurrentNode = CurrentNode.next;
			}
			CurrentNode.next = newNode;
		}
	}
 public  void deleteAt(int index)
 {
	 if(index==0)
	 {
		 head=head.next;
	 }
	 else
	 {
		 Node CurrentNode=head;
		 Node deleteNode=null;
		 for (int i = 0; i < index - 1; i++) {
				CurrentNode = CurrentNode.next;
			}
		 deleteNode=CurrentNode.next;
		 CurrentNode.next=deleteNode.next;
		 deleteNode=null;
	 }
 }
	public void show() {
		Node node = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (node.next != null) {
			System.out.println(node.data + "-" + node.next);
			node = node.next;
		}
		System.out.println(node.data + "-" + node.next);
	}
	public  int size()
	{
		int count=1;
		if (head != null) {
			Node CurrentNode = head;
			while (CurrentNode.next != null) {
				CurrentNode = CurrentNode.next;
				count++;
			}
		}
		else
		{
			count=0;
		}
		return count;
	}
}
