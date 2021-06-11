package com.internity.day2;

public class DigitPalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {8,6,-4,2,0,-1,9,-6};
	//	int a[]=new int[] {8,6,4,2,0,2,4,6,8};
		int b=palindromeCheck(a,a.length-1);
		if(b==1) 
			System.out.println("Digit array is Palindrome ");
		else
			System.out.println("Digit array is Not Palindrome ");

	}
	public static int palindromeCheck(int a[],int high) {
		int low=0,flag=0;
		while(low<=high) {
			if(a[low]==a[high]) {
				low++;
				high--;
				if(low==high) {
					flag=1;
				}
			}
			else {
				flag=0;
				break;
			}
		}
		return flag;
	}

}
