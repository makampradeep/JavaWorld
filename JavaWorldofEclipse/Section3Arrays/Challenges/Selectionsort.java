package Challenges;

import java.util.Scanner;

public class Selectionsort {

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

	int[] array=	selection(arr);
		 for(int ar:array)
		 {
			 System.out.println(ar);
		 }
		
	}

	
	
	public static int[] selection(int [] arr)
	{
	
		
		for(int counter=0;counter<arr.length;counter++)
		{
			int min=counter;
			
			for(int i=counter+1;i<arr.length;i++)
			{
				if(arr[i]<arr[min])
				{
					min=i;
				}
			int temp=arr[min];
			arr[min]=arr[counter];
			arr[counter]=temp;
			
			}
		}
		
		return arr;
	}
}
