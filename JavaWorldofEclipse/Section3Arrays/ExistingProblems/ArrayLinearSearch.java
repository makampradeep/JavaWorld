package ExistingProblems;

import java.util.Scanner;

public class ArrayLinearSearch {
	static Scanner scn =new Scanner(System.in);
	public static void main(String[] args) {
	
		int [] array=takeInput();
		int item=35;
		int index=linearsearch(array,item);
System.out.println(index);
	}

	public static int[] takeInput()
	{
		System.out.println("enter total no of arrayvalues  in array");
		int n=scn.nextInt();
		
		int [] arr=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter " +i +" array value");
		 arr[i]=scn.nextInt();
		 
		}
		
		return arr;
	}
	
	public static int linearsearch(int [] arr,int item)
	{
		System.out.println("will give index of item");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==item)
			{
				return i;
			}
		
		
		}
	
	return 100000;
	
	}
}
