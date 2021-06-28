package com.internity.day4;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,8,11,4,3,5,6,1};
		int result[]=selectionSort(a,a.length);
		for(int b:result) {
			System.out.print(b+" ");
		}
	}
	public static int[] selectionSort(int a[],int n) {
		
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;

			}
		}
		return a;
	}
}
