package Section2Challenges;

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
   *   *
  *   *
 *   *
*****

explination:For any input N. First line contains 4 space and then 5 {*} and then the second line contains according to the output format.
 */

public class HollowRhombusPattern {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int row=1;
		int nst=n;
		int nsp=n-1;
		while(row<=n)
		{
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++)
			{
				if(row==1||row==n)
				{
				System.out.print("*");
				}
				else 
				{
					if(cst==1||cst==nst)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
	System.out.println();
	nsp=nsp-1;
	row++;
		}
		
		

	}

}
