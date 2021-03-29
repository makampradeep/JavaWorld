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

ans if n=7


*** ***
**   **
*     *
       
*     *
**   **
*** ***


*/







public class Pattern17 {

	public static void main(String[] args) {
	
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int row=1;
		int nr=n;
		int nst=nr/2;
		int nsp=1;
		while(row<=nr)
		{
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*");
				
			}
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" ");
			}		
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*");
			}
		System.out.println();
		
			if(row<=nr/2)
			{
				nst=nst-1;
				nsp=nsp+2;
				
			}
			else
			{
				nst=nst+1;
				nsp=nsp-2;
			}
			row++;
		}
		

	}

}
