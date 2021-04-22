package ExistingProblems;

import java.util.Scanner;

public class LowerandUpperBoundofElement {
/*

 here we are finding lowest bound of element and upper bound of element 
 
 
 */
	public static void main(String[] args) {
		
		int[] array = {1,2,2,2,3,3,3,5,5,7,7,9,9,10};
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the data you want to fetch the index of");
		int data =scn.nextInt();
		
		
		int lowerdata=Lowerbound(array,data);
		int upperdata=upperrbound(array,data);
		
System.out.println(lowerdata);
System.out.println(upperdata);
	}

	public static int Lowerbound(int[] array,int data)
	{
		int low=0;
		int high=array.length-1;
		int ans=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(array[mid]==data)
			{
				ans=mid;
				high=mid-1;
				
			}
		
			else if(data<array[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		
		}
	
	return ans;
	}
	
	
	
	public static int upperrbound(int[] array,int data)
	{
		int low=0;
		int high=array.length-1;
		int ans=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(array[mid]==data)
			{
				ans=mid;
				low=mid+1;
				
			}
		
			else if(data<array[mid])
			{
				
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		
		}
	
	return ans;
	}
	
	
	
}
