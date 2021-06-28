package com.internity.day5;

public class DeletePointerLinkedList {
	static Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			
		}
	}
	void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	void deleteNode(Node node) {
		Node temp=node.next;
		node.data=temp.data;
		node.next=temp.next;
		System.gc();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeletePointerLinkedList list=new DeletePointerLinkedList();
		list.head=new Node(1);
		list.head.next=new Node(12);
		list.head.next.next=new Node(1);
		list.head.next.next.next=new Node(4);
		list.head.next.next.next.next=new Node(1);
		
		System.out.println("Before Deleting ");
		list.printList(head);
		
		list.deleteNode(head);
		System.out.println("");
		System.out.println("After deleting ");
		list.printList(head);
		
	}

}
