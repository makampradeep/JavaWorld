package Challenges;

import java.util.Scanner;
/**
 
 ake as input a two-d array. Wave print it row-wise.

Input Format
Two integers M(row) and N(column) and further M * N integers(2-d array numbers).

Constraints
Both M and N are between 1 to 10.

Output Format
All M * N integers are seperated by commas with 'END' written in the end(as shown in example).

Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41, END
 
 
 

 */
public class Waveprint {

	public static void main(String[] args) {
		
		
		int[][] array =provideinput();
		
		displayarray(array);
		waveprintrowwise(array);
	
	
	}
   public static  int[][] provideinput()
   {
	   Scanner scan =new Scanner(System.in);
		System.out.println("enter m * n  in array");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int[][]array  =new int[m][n];
		for(int row=0;row<array.length;row++)
		{
			for(int col=0;col<array[row].length;col++)
			{
				System.out.println("enter row "+row+"and enter column"+col);
				array[row][col]=scan.nextInt();
			}
		}
	   return  array;
   }
	
	public static void displayarray(int[][] array)
	{
		
		for(int[] ar:array)
		{
			for(int a:ar)
			{
				System.out.print(a+" ");
			}
		System.out.println();
		}
	}
	public static void waveprintrowwise(int[][] array)
	{
		for(int row=0;row<array.length;row++)
		{
			
				if(row%2==0)
				{
					for(int col=0;col<array[row].length;col++)
					{
						System.out.print(array[row][col]+" ");
					}
				}
				else
				{
					for(int col=array[row].length-1;col>=0;col--)
					{
						System.out.print(array[row][col]+" ");
					}
				}
		
		}
		System.out.print("END");
	}
	
	
}
