package com.internity.day4;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,7,8,9,10,2,3,4,5};		
		int key=0;
		int result[]=bubbleSort(a,a.length-1);
		for(int b: result)
			System.out.print(b+" ");
	}
	public static int[] bubbleSort(int a[],int n ) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++){
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}

}
