package com.internity.day4;

public class SortArray012 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		int a[]= {2,1,1,0,1,2,1,2,0,0,0,1,2};
		int step=0;
		int low=0,mid=0,high=a.length-1;
		while(mid<=high) {
			if(a[mid]==2) {
					swap(a,mid,high);
					high--;
					step++;
				}
			else if(a[mid]==0) {
				swap(a,low,mid);
				mid++;
				low++;
				step++;
			}
			else if(a[mid]==1){
				mid++;
				step++;
			}
			
		}
		System.out.println("Sorting completed in "+step);
			for(int b:a) {
				System.out.print(b+ " ");
			}
			}
		public static  void swap(int arr[],int p1,int p2 ) {
			for(int i=0;i<arr.length;i++) {
			int temp=arr[p1];
			arr[p1]=arr[p2];
			arr[p2]=temp;
	}
		}
	}
