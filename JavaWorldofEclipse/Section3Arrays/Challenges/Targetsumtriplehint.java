package Challenges;
/**
 
  Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all triplets of numbers which sum to target.

Input Format
First line contains input N.
Next line contains N space separated integers denoting the elements of the array.
The third line contains a single integer T denoting the target element.

Constraints
Length of Array should be between 1 and 1000.

Output Format
Print all the triplet present in the array in a new line each. The triplets must be printed as A, B and C where A,B and C are the elements of the triplet ( A<=B<=C) and all triplets must be printed in sorted order. Print only unique triplets.

Sample Input
9
5 7 9 1 2 4 6 8 3
10
Sample Output
1, 2 and 7
1, 3 and 6
1, 4 and 5
2, 3 and 5
Explanation
Array = {5, 7, 9, 1, 2, 4, 6 ,8 ,3}. Target number = 10. Find any three number in the given array which sum to target number.

 
 
 
 
 
 
 
 */
import java.util.Scanner;

public class Targetsumtriplehint {

	public static void main(String[] args) {
	
		Scanner scan =new Scanner(System.in);
		System.out.println("enter total no of values in array");
		int n=scan.nextInt();
		int[] array =new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter"+i+"value");
			array[i]=scan.nextInt();
		}
		System.out.println("enter target");
		int target=scan.nextInt();
		
		int[] array1=bubblesort(array);
		
			
		
		triplesum(array1,target);
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
	
	public static void triplesum(int[] array,int target)
	{
		
		for(int i=0;i<array.length;i++)
		{
			
			int left =i+1;
			int right =array.length-1;
			while(left<right)
			{
				if(array[i]+array[left]+array[right]>target)
				{
					right--;
				}
				else if(array[i]+array[left]+array[right]==target)
				{
				
					System.out.println(array[i]+","+array[left]+" and "+array[right]);
					left++;
					right--;
				}
				else if(array[i]+array[left]+array[right]<target)
				{
					left++;
				}
			}
		}
		
		
	}
}
