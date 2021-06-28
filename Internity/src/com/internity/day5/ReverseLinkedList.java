package com.internity.day5;

import java.io.*;
public class ReverseLinkedList {

	Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static ReverseLinkedList insert(ReverseLinkedList list,int data) {
		//create a node with given data
		Node new_node = new Node(data);
		new_node.next=null;
		
		//if list is empty  then make the new node as head
		if(list.head==null) {
			list.head=new_node;
		}
		else {
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}
	public static void reverse(ReverseLinkedList list) {
		Node prev=null;
		Node current =list.head;
		Node nextnode=null;
		while(current!=null) {
			nextnode=current.next;
			current.next=prev;
			prev=current;
			current=nextnode;
		}
		list.head=prev;
		}

	public static void printList(ReverseLinkedList list) {
		Node currNode=list.head;
		 System.out.println("Linked List: ");
		 //traverse the linkedlist
		 while(currNode!=null) {
			 System.out.println(currNode.data+" ");
			 
			 currNode=currNode.next;
		 }
	}
	public static void main(String[] args) {
	 
		ReverseLinkedList list=new ReverseLinkedList();
		
		//inserting data
		list=insert(list,1);
		list=insert(list,2);
		list=insert(list,3);
		list=insert(list,4);
		list=insert(list,5);
		list=insert(list,6);
		list=insert(list,7);
		list=insert(list,8);
		
		printList(list);
		reverse(list);
		System.out.println("Reverse of a linkedlist");
		printList(list);

	}

}
