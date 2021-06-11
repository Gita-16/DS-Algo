package com.internity.day2;

public class MaxMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,6,43,65,78,90,12,32,14};
		//finding maximum element
		int max=a[0],min=a[0];
		for(int i=0;i<a.length-1;i++) {
				if(a[i]>max)
					max=a[i];
				if(a[i]<min)
					min=a[i];
			}
		System.out.println("Maximum element="+max);
		System.out.println("Minimum element="+min);

	}

}
