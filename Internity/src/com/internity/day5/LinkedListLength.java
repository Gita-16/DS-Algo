package com.internity.day5;

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
		
	}
}
public class LinkedListLength {
	
	Node head;
	public void push(int new_data) {
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public int getCount() {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListLength ll=new LinkedListLength();
		ll.push(1);
		ll.push(3);
		ll.push(5);
		ll.push(7);
		System.out.println("Count of nodes is "+ll.getCount());
	}

}
