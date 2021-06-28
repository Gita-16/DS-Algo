package com.internity.day5;

import java.util.*;

public class AlternateFirstLastElement {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	static void printList(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	static void arrange(Node head) {
		Deque<Integer> deque=new ArrayDeque<>();
		Node temp=head;
		while(temp!=null) {
			deque.addLast(temp.data);
			temp=temp.next;
		}
		temp=head;
		int i=0;
		while(!deque.isEmpty()) {
			if(i%2==0) {
				temp.data=deque.removeFirst();
			}
			else {
				temp.data=deque.removeLast();
			}
			i++;
			temp=temp.next;
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=null;
		head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		
		System.out.println("Given linked list");
		printList(head);
		arrange(head);
		System.out.println("\n After rearrangement");
		printList(head);
	}

}
