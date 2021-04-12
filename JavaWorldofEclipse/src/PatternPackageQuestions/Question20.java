package PatternPackageQuestions;

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
 
ans if n=9


 	 	 	*	
 	 	*	 	*	
 	*	 	 	 	*	
*	 	 	 	 	 	*	
 	*	 	 	 	*	
 	 	*	 	*	
 	 	 	*	


 */

public class Question20 {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int row=1;
		int nsp=n/2;
		int nst=1;
		int nsp1=1;
		while(row<=n)
		{
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" "+"\t");
			}
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*"+"\t");
			}
			int csp1=1;
			if(row==1||row==n)
			{
				csp1=2;
			}
			for(;csp1<=nsp1;csp1++)
			{
				System.out.print(" "+"\t");
			}
			int cst=1;
			if(row==1||row==n)
			{
				cst=2;
			}
			for(;cst<=nst;cst++)
			{
				System.out.print("*"+"\t");
			}
		System.out.println();
		if(row<=n/2)
		{
			if(row!=1)
			{
		nsp1=nsp1+2;
			}
		nsp=nsp-1;
		}
		else if (row>n/2&row!=n)
		{
			nsp1=nsp1-2;
			nsp=nsp+1;
		}
		row++;
		}
		
		

	}

}
