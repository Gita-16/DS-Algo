package com.internity.day2;

public class NegativeLeftSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {8,6,-4,2,0,-1,9,-6,5,-2};
		int b[]=leftNegative(a,a.length-1);
		for(int arr:b) {
			System.out.println(arr+" ");
		}
	}
	public static int[] leftNegative(int a[],int high) {
		int low=0;
		while(low<=high) {
			if(a[low]>0) { 
				if(a[high]>0) {
					high--;
				}
				else {
					swap(a,low,high);
					low++;
					high--;
				}
			}
			else {
				low++;		
			}
		}
		return a;

	}
	public static void swap(int a[],int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
