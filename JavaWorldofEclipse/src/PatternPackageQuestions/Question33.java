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
 
ans if n=10


         0
        909
       89098
      7890987
     678909876
    56789098765
   4567890987654
  345678909876543
 23456789098765432
1234567890987654321


 */

public class Question33 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int row=1;
		int nsp=n-1;
		int nst=1;
		while(row<=n) 
		{
			int val=n-row+1;
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" ");
			}	
			for(int cst=1;cst<=nst;cst++)
			{
				if(cst==row)
				{
					System.out.print("0");
				}
				else
				{
					
					if(cst<=nst/2)
					{
						System.out.print(val);
					val++;
					
					
					}
					else
					{
						val--;
						System.out.print(val);
						
					}
					
				
				}
			}
	    System.out.println();
		nsp=nsp-1;
		nst=nst+2;
		row++;
		
	
		}
		

	}

}
