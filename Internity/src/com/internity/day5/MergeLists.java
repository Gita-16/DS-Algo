package com.internity.day5;
//Merge two sorted data
class Node1{
	int data;
	Node1 next;
	Node1(int data){
		this.data=data;
		this.next=null;
	}
}
public class MergeLists {
	Node1 head;
	public  void insertAtEnd(Node1 node) {
		if(head==null) {
			head=node;
		}
		else {
		Node1 temp=head;
		while(temp.next!=null) 
			temp=temp.next;
		temp.next=node;
		}
	}
	public void printList() {
		Node1 temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeLists list1=new MergeLists();
		
		list1.insertAtEnd(new Node1(3));
		list1.insertAtEnd(new Node1(8));
		list1.insertAtEnd(new Node1(9));
		
		MergeLists list2=new MergeLists();
		list2.insertAtEnd(new Node1(5));
		list2.insertAtEnd(new Node1(7));
		list2.insertAtEnd(new Node1(10));
		//list1.printList();
		list1.head=new OperationMerge().sortMerge(list1.head,list2.head);
		list1.printList();
	}

}
class OperationMerge{
	Node1 sortMerge(Node1 headA,Node1 headB) {
		Node1 dummyNode=new Node1(0);
		
		Node1 tail=dummyNode;
		while(true) {
			if(headA==null) {
				tail.next=headB;
				break;
				}
			if(headB==null) {
				tail.next=headA;
				break;
				}
			//tail=tail.next;
			if(headA.data<=headB.data) {
				tail.next=headA;
				headA=headA.next;
			}
			else {
				tail.next=headB;
				headB=headB.next;
			}
			tail=tail.next;
		}
		return dummyNode.next;
	}
}