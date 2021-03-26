package Patterns;

import java.util.Scanner;

/**
 * total number of rows
 * work to be done in every row
 * preperation to do for the next row
 * 
 * cst==count of stars
 * nst=number of stars
 * 
 */
/**
 
ans if n=5


*****
****
***
**
*


 */



public class Pattern3 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int row=1;
		int nst=n;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nst)
			{
				//work
				
				System.out.print("*");
				cst++;
			}
		
		//preperation
			
			System.out.println();
			row=row+1;
			nst=nst-1;
		}

	}

}
