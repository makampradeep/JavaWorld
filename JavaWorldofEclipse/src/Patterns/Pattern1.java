package Patterns;

import java.util.Scanner;

public class Pattern1 {

	
	/**
	 * total number of rows
	 * work to be done in every row
	 * preperation to do for the next row
	 * 
	 */
	/**
	 
	ans if n=5
	

*****
*****
*****
*****
*****
	
	
	 */
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
	
		
		for(int row=0;row<n;row++)
		{
			//work
			for(int col=0;col<n;col++)
			{
			System.out.print("*");
			
			}
		
//		preperation for next row
			
			System.out.println();
		}
		
		

	}

}
