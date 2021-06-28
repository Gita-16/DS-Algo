package com.internity.day5;

import java.util.*;

class Node3{
	int data;
	Node3 next;
	public Node3(int data) {
		this.data=data;
		this.next=next;
	}
}
public class LinkedListIntersect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list1
		Node3 n1=new Node3(1);
		n1.next=new Node3(2);
		n1.next.next=new Node3(3);
		n1.next.next.next=new Node3(4);
		n1.next.next.next.next=new Node3(5);
		n1.next.next.next.next.next=new Node3(6);
		n1.next.next.next.next.next.next=new Node3(7);
		
		//list2
		Node3 n2=new Node3(10);
		n2.next=new Node3(9);
		n2.next.next=new Node3(8);
		n2.next.next.next=n1.next.next.next;
		print(n1);
		print(n2);
		System.out.println(MergeNode(n1,n2).data);
	}
	public static void print(Node3 n) {
		Node3 cur=n;
		while(cur!=null) {
			System.out.println(cur.data+" ");
			cur=cur.next;
		}
		System.out.println();
	}
public static Node3 MergeNode(Node3 n1,Node3 n2) {
	HashSet<Node3> hs=new HashSet<Node3>();
	while(n1!=null) {
		hs.add(n1);
		n1=n1.next;
	}
	while(n2!=null) {
		if(hs.contains(n2)) {
			return n2;
		}
		n2=n2.next;
	}
	return null;
}
}
