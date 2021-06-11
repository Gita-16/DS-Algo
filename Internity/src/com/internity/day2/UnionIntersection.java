package com.internity.day2;

public class UnionIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,3,4,5,7};
		int n1=arr1.length;
		int arr2[]= {2,3,5,6};
		int n2=arr2.length;
		union(arr1,n1,arr2,n2);
		intersection(arr1,n1,arr2,n2);
	}
	public static void union(int[] arr1,int m,int arr2[],int n) {
		System.out.println("Union array:");
		int i=0,j=0;
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
		System.out.print(arr1[i++]+" ");
			}
			else if(arr2[j]<arr1[i]) {
				System.out.print(arr2[j++]+" ");
			}
			else {
				System.out.print(arr2[j++]+" ");
				i++;
			}
		}
		while(i<m) {
			System.out.print(arr1[i++]+" ");
		}
		while(j<n) {
			System.out.print(arr2[j++]+" ");
		}
		System.out.println();
	}
	
	public static void intersection(int[] arr1,int m,int arr2[],int n) {
		System.out.println("Intersection array:");
		int i=0,j=0;
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr2[j]<arr1[i]) {
				j++;
			}
			else {
				System.out.print(arr2[j++]+" ");
				i++;
			}
		}
	}
	
		
			
}
