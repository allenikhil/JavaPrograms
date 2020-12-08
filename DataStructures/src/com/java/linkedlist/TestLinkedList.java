package com.java.linkedlist;

public class TestLinkedList {
 Node head;
public  void insertAtStart(int data)
{
	Node newNode=new Node(data);
	newNode.next=head;
	head=newNode;
}
public void print()
{
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
public int size()
{
	int count=0;
	if(head!=null)
	{
		Node CurrentNode = head;
		while (CurrentNode.next != null) {
			CurrentNode = CurrentNode.next;
			count++;
		}
	}
	return count;
}
}
