package ExistingProblems;

import java.util.Scanner;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter item you wanna check index of");
		int item =scn.nextInt();
		
		int [] array = {5,7,10,12,15,20,27,31,36,42,55,58,60,65,70,80};
		int ite=binarysearch(array,item);
System.out.println(ite);
	}

public static int binarysearch(int [] array,int item)
{
	int lo=0;
	int high=array.length-1;
	
	while(lo<=high)
	{
		
		int mid=(lo+high)/2;
	
		if(array[mid]<item)
		{
			lo=mid+1;
		}
		else if(array[mid]>item)
		{
			high=mid-1;
		}
		else 
		{
			return mid;
		}
	}

return 100000;
}



}
