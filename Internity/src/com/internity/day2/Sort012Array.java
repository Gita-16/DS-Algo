package com.internity.day2;
//5. Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
public class Sort012Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,1,0,2,1,0,0,2};
		int b[]=sortLowValArray(a,a.length-1);
		for(int arr:b) {
			System.out.println(arr+" ");
		}
		}
		public  static int[] sortLowValArray(int a[],int high) {
 		int mid=0,low=0;
		while(mid<=high) {
			if(a[mid]==2) {
				swap(a,mid,high);
				high--;
			}
			else if(a[mid]==0) {
				swap(a,mid,low);
				mid++;
				low++;
			}
				else if(a[mid]==1) {
					mid++;
					
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
