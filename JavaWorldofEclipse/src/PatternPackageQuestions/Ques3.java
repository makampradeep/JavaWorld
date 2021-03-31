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
 
ans if n=5


*****
****
***
**
*


 */

public class Ques3 {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int nst=n;
		
		for(int row=1;row<=n;)
		{
			//work
			
			for(int cst=1;cst<=nst;cst++)
			{
			System.out.print("*");
			
			}
		
//		preperation for next row
			
			System.out.println();
			row=row+1;
			nst=nst-1;
			
		}
		

		
		
		

	}

}
