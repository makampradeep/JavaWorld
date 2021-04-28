package Challenges;


/*
Find position of the last and first occurrence of a given number in a sorted array. If number does not exist then print lower and upper bound as -1.

Input Format
First line contains an integer n denoting the size of the array.
Second line contains n space separated integers denoting array elements.
Third line contains single integer Q denoting the no of queries.
Q lines follow , each containing a single integer x that is to be searched in the array.

Constraints
1 <= N <= 10^5
1 <= Q <= 100

Output Format
For each query , print the lowerbound and the upperbound for the number x in a new line each.

Sample Input
5
1 2 3 3 4
3
2
3
10
Sample Output
1 1
2 3
-1 -1
Explanation
The first and the last occurrence of 2 in the given array are both 1.
The first occurrence of 3 is at index=2 and last at index=3.
10 is not present in the array so we print -1 for it.
 */




public class upperandlowerbound {

	public static void main(String[] args) {
	
		int l=lowerbound();
		System.out.println(l);
int h=upperbound();
System.out.println(h);
	}

	
	public static int lowerbound()
	{
		
		
		int[] arr= {1,2,3,3,4};
		int target=3;
		int l=0;
		int h=arr.length-1;
		int lowerbound=-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			
			if(target<arr[mid])
			{
				h=mid-1;
			}
	
			else if (target>arr[mid])
			{
				l=mid+1;
			}
	
			else
			{
				lowerbound=mid;
				h=mid-1;
			}
		
		}
		return lowerbound;
}


	public static int upperbound()
	{
		
		
		int[] arr= {1,2,3,3,4};
		int target=3;
		int l=0;
		int h=arr.length-1;
		int upperbound=-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			
			if(target<arr[mid])
			{
				h=mid-1;
			}
	
			else if (target>arr[mid])
			{
				l=mid+1;
			}
	
			else
			{
				upperbound=mid;
				l=mid+1;
			}
		
		}
		return upperbound;
}












}
