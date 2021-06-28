package com.internity.day4;
import java.lang.*;
//Given a sorted array and a number x, find the pair in array whose sum is closest to x
//Given a sorted array and a number x, find a pair in array whose sum is closest to x.
//Examples:
//Input: arr[] = {10, 22, 28, 29, 30, 40}, x = 54
//Output: 22 and 30
//Input: arr[] = {1, 3, 4, 7, 10}, x = 15
//Output: 4 and 10
public class PairSumCloseToX {
	private static int min;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 22, 28, 29, 30, 40}, x = 54;
		//int arr[] = {1, 3, 4, 7, 10}, x = 15;
		int n=arr.length;
		pairWhoseSumCloseToX(arr,n,x);
	}
	public static void pairWhoseSumCloseToX(int a[],int n,int givenSum) {
	int l=0,r=n-1,diff=Integer.MAX_VALUE,res_l = 0,res_r=0;
	while(r>l) {
		if(Math.abs(a[l]+a[r]-givenSum)<diff) {
			res_l=l;
			res_r=r;
			diff=Math.abs(a[l]+a[r]-givenSum);
		}
	if(a[l]+a[r]>givenSum)
		r--;
	else
		l++;
		
	}
	System.out.println(a[res_l]+" and "+a[res_r]);
	}
}