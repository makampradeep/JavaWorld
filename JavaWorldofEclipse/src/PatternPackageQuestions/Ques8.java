package PatternPackageQuestions;

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


*   *
 * * 
  *  
 * * 
*   *


*/
public class Ques8 {

	public static void main(String[] args) {
	
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int row=1;
		int nst=n;
		int i=1;
		while(row<=n)
		{
			if(row==1||row==n&&row!=n/2+1)
			{
			for(int cst=1;cst<=nst;cst++)
			{
				if(cst==1||cst==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			}
			else if(row == n/2+1)
			{
				for(int cst=1;cst<=nst;cst++)
				{
					if(cst==n/2+1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			else
			{
				for(int cst=1;cst<=nst;cst++)
				{
					if(cst==row||cst==n-row+1)
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
		row=row+1;
		
		}
		

	}

}
