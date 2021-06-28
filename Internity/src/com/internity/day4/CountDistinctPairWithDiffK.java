package com.internity.day4;
//Examples: 
//Input: arr[] = {1, 5, 3, 4, 2}, k = 3
//Output: 2
//There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2} 
//
//Input: arr[] = {8, 12, 16, 4, 0, 20}, k = 4
//Output: 5
//There are 5 pairs with difference 4, the pairs are {0, 4}, {4, 8}, 
//{8, 12}, {12, 16} and {16, 20}
public class CountDistinctPairWithDiffK {
	private static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int a[] = {1, 5, 3, 4, 2};
//		 int k = 3;
		int a[]={8, 12, 16, 4, 0, 20};
		int k = 4;
		printOutout(a,k);

	}
	public static void printPairs(int a[],int k) {
		
		for(int i=0;i<a.length;i++) {
			int first=a[i];
			for(int j=i;j<a.length;j++) {
				int second=a[j];
				if(first-second==k || first-second==-k) {
				count++;
				System.out.print("{"+first+","+second+"},");
			}
		}
	}

}
	public static void printOutout(int givenArray[],int givenSum) {
		System.out.print("The pairs are ");
		printPairs(givenArray,givenSum);
}
}
