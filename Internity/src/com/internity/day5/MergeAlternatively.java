package com.internity.day5;

public class MergeAlternatively {
	Node4 head;
	
	class Node4{
		int data;
		Node4 next;
		public Node4(int data){
			this.data=data;
			this.next=null;
		}
	}
	void push(int newdata) {
		Node4 newnode=new Node4(newdata);
		newnode.next=head;
		head=newnode;
	}
	void merge(MergeAlternatively q) {
		Node4 p_curr=head,q_curr=q.head;
		Node4 p_next,q_next;
		while(p_curr!=null && q_curr!=null) {
			p_next=p_curr.next;
			q_next=q_curr.next;
			
			q_curr.next=p_next;
			p_curr.next=q_curr;
			
			p_curr=p_next;
			q_curr=q_next;
			
			
		}
		q.head=q_curr;
	}
	void printList() {
		Node4 temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeAlternatively list1=new MergeAlternatively();
		MergeAlternatively list2=new MergeAlternatively();
		
		list1.push(3);
		list1.push(2);
		list1.push(1);
		
		System.out.println("First Linked List:");
		list1.printList();
		
		list2.push(8);
		list2.push(7);
		list2.push(6);
		list2.push(5);
		list2.push(4);
		
		System.out.println("Second Linked List:");
		list1.merge(list2);
		
		System.out.println("Modified first linked list:");
		list1.printList();
		
		System.out.println("Modified second linked list:");
		list2.printList();
	}

}
