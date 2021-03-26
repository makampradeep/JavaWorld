package Patterns;

import java.util.Scanner;

/**
 * total number of rows
 * work to be done in every row
 * preperation to do for the next row
 * 
 * cst==count of stars
 * nst=number of stars
 * csp=sount of spaces
 * nsp=number of spaces
 * 
 */
/**
 
ans if n=5


    *
   **
  ***
 ****
*****


 */


public class Pattern4 {

	
	
	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int nsp=n-1;
		int nst=1;
		for(int row=1;row<=n;)
		{
			//work
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*");
			}
		//preperation for next row

			System.out.println();
			nsp=nsp-1;
			nst=nst+1;
			row=row+1;
		}

	}

}
