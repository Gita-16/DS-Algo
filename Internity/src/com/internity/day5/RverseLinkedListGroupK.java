package com.internity.day5;

public class RverseLinkedListGroupK {
	Node7 head;
	class Node7{
		int data;
		Node7 next;
		public Node7(int data) {
			this.data=data;
			this.next=null;
		}
	}
	Node7 reverse(Node7 head,int k) {
		if(head==null)
			return null;
		Node7 current=head;
		Node7 next=null;
		Node7 prev=null;
		int count=0;
		
		while(count<k && current !=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			count++;
			}
	
	if(next!=null)
		head.next=reverse(next,k);
	return prev;
	}
	public void push(int newdata) {
		Node7 newnode=new Node7(newdata);
		newnode.next=head;
		
		head=newnode;
	}
	void printList() {
		Node7 temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RverseLinkedListGroupK ll=new RverseLinkedListGroupK();
		ll.push(9);
		ll.push(8);
		ll.push(7);
		ll.push(6);
		ll.push(5);
		ll.push(4);
		ll.push(3);
		ll.push(2);
		ll.push(1);
		System.out.println("Given Linked List");
		ll.printList();
		
		ll.head=ll.reverse(ll.head, 3);
		System.out.println("Reverse list");
		ll.printList();
	}

}

