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


    *
   ***
  *****
 *******
*********


*/
public class Ques9 {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();	
		int row=1;
		int nr=n;
		int nst=1;
		int nsp=nr-1;
		while(row<=n)
		{
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" ");
			}	
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*");
				
			}
	
			
		System.out.println();
		
			
				nst=nst+2;
				nsp=nsp-1;
				
			row++;
		}
		
		
		

	}

}
