package com.internity.day5;

public class SortList {
	class Node2{
		int data;
		Node2 next;
		public Node2(int data) {
			this.data=data;
			this.next=null;
		}
	}
		public Node2 head=null;
		public Node2 tail=null;
		
		public void addNode(int data) {
			Node2 newnode=new Node2(data);
			
			if(head==null) {
				head=newnode;
				tail=newnode;
			}
			else {
				tail.next=newnode;
				tail=newnode;
			}
		}
		public void sortList() {
			Node2 current=head, index=null;
			int temp;
			if(head==null)
				return;
			else {
				while(current!=null) {
					index=current.next;
					while(index!=null) {
						if(current.data>index.data) {
							temp=current.data;
							current.data=index.data;
							index.data=temp;
						}
						index=index.next;
				}
				current=current.next;
				}
			}
		}
		public void display() {
			
			Node2 current=head;
			if(head==null) {
				System.out.println("List is Empty: ");
				return;
			}
			while(current!=null) {
				System.out.println(current.data+" ");
				current=current.next;
			}
			System.out.println();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortList st=new SortList();
		st.addNode(8);
		st.addNode(3);
		st.addNode(7);
		st.addNode(4);
		
		System.out.println("Original List: ");
		st.display();
		st.sortList();
		
		System.out.println("Sorted List:  ");
		st.display();
		
	}

}
