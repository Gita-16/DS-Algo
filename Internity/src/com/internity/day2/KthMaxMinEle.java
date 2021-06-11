package com.internity.day2;

import java.util.*;
public class KthMaxMinEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Integer  a[]=new Integer[] {2,3,4,5,6,43,65,78,90,12,32,14};
		Arrays.sort(a);
		System.out.println("Enter the Kth max element you want:");
		int max=sc.nextInt();
		System.out.println(max+"th maximum element:"+a[max-1]);
		System.out.println("Minimum element:"+a[0]);
	}

}
