package com.internity.day5;

public class LinkedListDeleteSepecific {
	Node6 head;
	class Node6{
		int data;
		Node6 next;
		Node6(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	public void push(int newdata) {
		Node6 newnode=new Node6(newdata);
		newnode.next=head;
		head=newnode;
	}
	void deleteNode(int position) {
		if(head==null)
			return;
		Node6 temp=head;
		if(position==0) {
			head=temp.next;
			return;
		}
		for(int i=0;temp!=null && i<position-1;i++)
			temp=temp.next;
		
		if(temp==null || temp.next==null)
			return;
		
		Node6 next=temp.next.next;
		temp.next=next;
		
	}
	public void printList() {
		Node6 tnode=head;
		while(tnode!=null) {
			System.out.print(tnode.data+" ");
			tnode=tnode.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListDeleteSepecific ll=new LinkedListDeleteSepecific();
		ll.push(7);
		ll.push(1);
		ll.push(3);
		ll.push(8);
		
		System.out.println("\n Created Linked list is: ");
		ll.printList();
		
		ll.deleteNode(1);
		System.out.println("\nLinked List after Deletion at position 4: ");
		ll.printList();
		
		
	}

}
