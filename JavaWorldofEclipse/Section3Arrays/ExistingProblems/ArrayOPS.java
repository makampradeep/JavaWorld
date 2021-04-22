package ExistingProblems;

import java.util.Scanner;
//consiste of taking and displaying input
//to find maximum
public class ArrayOPS {

	static Scanner scn =new Scanner(System.in);
	public static void main(String[] args) {
		

		
		
		int [] array=takeInput();
		display(array);
		int maximumvalue=Arraymax(array);
		System.out.println("maximumvalue is "+maximumvalue);
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



	public static void display(int [] arr)
	{
		System.out.println("array is displayed 2 times one is with for each other with normal for loop");
		for(int array:arr)
		{
			System.out.println(array);
		}
	
		System.out.println("array is displayed 2 times one is with for each other with normal for loop");
	
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println("array is displayed 2 times one is with for each other with normal for loop");
	}

	
	public static int Arraymax(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
		
	}
	
	
	

}
