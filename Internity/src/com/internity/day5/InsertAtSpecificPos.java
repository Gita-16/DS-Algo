package com.internity.day5;

public class InsertAtSpecificPos {
	static class Node5{
		int data;
		Node5 next;
		public Node5(int data) {
			this.data=data;
		}
	}
	static Node5 getNode(int data) {
		return new Node5(data);
	}
	static Node5 InsertPos(Node5 headNode,int position ,int data) {
		Node5 head=headNode;
		if(position <1) {
			System.out.print("Invalid position");
		}
		
		if(position==1) {
			Node5 newNode=new Node5(data);
			newNode.next=headNode;
			head=newNode;
			
		}
		else {
			while(position-- !=0){
				if(position==1) {
					Node5 newNode=getNode(data);
					newNode.next=headNode.next;
					headNode.next=newNode;
					break;
				}
				headNode=headNode.next;
				
			}
			if(position!=1)
				System.out.print("Position out of range");	
		}
		return head;
	}
	static void PrintList(Node5 node) {
		while(node!=null) {
			System.out.print(node.data);
			node=node.next;
			if(node!=null) {
				System.out.print(",");
			}

		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node5 head=getNode(3);
		head.next=getNode(5);
		head.next.next=getNode(8);
		head.next.next.next=getNode(10);
		
		System.out.println("Linked list before insertion: ");
		PrintList(head);
		
		int data=12,pos=3;
		head=InsertPos(head,pos,data);
		System.out.print("Linked list after" + "insertion of 1 at position 3: ");
		PrintList(head);
		
		data=1;
		pos=1;
		head=InsertPos(head,pos,data);
		System.out.print("Linked list after "+"insertion of 1 at position 1: ");
		PrintList(head);
		
		data=15;
		pos=7;
		head=InsertPos(head,pos,data);
		System.out.print("Linked list after"+" insertion of 15 at position 7: ");
		PrintList(head);
		
	}
}

