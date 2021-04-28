package Challenges;

import java.util.Scanner;
/*
 
 Take as input N, the size of array. Take N more inputs and store that in an array. Take as input a number M. Write a function which returns the index on which M is found in the array, in case M is not found -1 is returned. Print the value returned.You can assume that the array is sorted, but you’ve to optimize the finding process. For an array of size 1024, you can make 10 comparisons at maximum.

1.It reads a number N.
2.Take Another N numbers as input in Ascending Order and store them in an Array.
3.Take Another number M as input and find that number in Array.
4.If the number M is found, index of M is returned else -1 is returned.Print the number returned.
 
 Sample Input
5
3
5
6
9
78
6
Sample Output
2
Explanation
Array = {3, 5, 6, 9, 78}, target number = 6 . Index of number 6 in the given array = 2. Write Binary search to find the number in given array as discuss in the class.
 
 */
public class Binarysearch {

	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter total no of values in array");
		int n=scan.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter "+i+" value");
			arr[i]=scan.nextInt();
			
		}
		System.out.println("enter data you want to find");
int data=scan.nextInt();

	int index=	binary(arr,data);
		 System.out.println(index);

	}

	
	public static int binary(int[] array,int data) {
		
		int low=0;
		int high =array.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(array[mid]>data)
			{
				high=mid-1;
			}
			else if(array[mid]<data)
			{
				low=mid+1;
			}
			else
			{
				return mid;
			}
			
		}
		
		return -1;
		
	}
}
