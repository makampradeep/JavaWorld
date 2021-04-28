package Challenges;

import java.util.Scanner;
/**


Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.

Input Format
The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.

Constraints
Length of the arrays should be between 1 and 1000.

Output Format
Print all the pairs of numbers which sum to target. Print each pair in increasing order.

Sample Input
5
1
3
4
2
5
5
Sample Output
1 and 4
2 and 3
Explanation
Find any pair of elements in the array which has sum equal to target element and print them.






 *
 */
public class TargetsumParis {

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
		int[] arr1=bubblesort(array);
		waveprintrowwise(arr1,target);

	}
	public static int[] bubblesort(int[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			
			for(int j=i+1;j<array.length-1;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
					
				}
			}
		}
	return array;
	}
	
	
	
	
	public static void waveprintrowwise(int[] array,int target)
	{
		for(int i=0;i<array.length-1;i++)
		{
			
			for(int j=i+1;j<array.length-1;j++)
			{
				if(array[i]+array[j]==target)
				{
					System.out.println(array[i]+" and "+ array[j]);
				}
			}
		}
		
		
		
		
	}
}
