package Challenges;

import java.util.Scanner;
/***

Input Format
The first line contains N - the size of the array. the next N lines contain the numbers of the array.The next line contains the item to be searched.

Constraints
Output Format
Output the index of number in the array to be searched. Output -1 if the number is not found.

Sample Input
5
4
5
1
2
3
2
Sample Output
3
Explanation
The given rotated array is [4, 5, 1, 2, 3]. The element to be searched is 2 whose index is 3.




 */
public class Helprahultosearch {

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

int target=search(arr,data);
	System.out.println(target);	

	}
	
	public static int search(int[] arr,int data) {
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==data)
			{
				return i;
			}
		}
	return -1;
	}

	public static int[] bubblesort(int[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
			}
		}
	return array;
	}
	
	public static int binarysearch(int[] array,int data)
	{
		int low=0;
		int high=array.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(data>array[mid])
			{
				low=mid+1;
			}
			else if(data<array[mid])
		{
			high=mid-1;
		}
			else
			{
				return mid;
			}
		
		
		}
	return -1;
	}
	
}
