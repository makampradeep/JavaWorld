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

ans if n=7


*	*	*	*	*	*	*	
*	*	*	 	*	*	*	
*	*	 	 	 	*	*	
*	 	 	 	 	 	*	
*	*	 	 	 	*	*	
*	*	*	 	*	*	*	
*	*	*	*	*	*	*	


*/
public class Ques19 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int row=1;
		int nsp=1;
		int nst=n/2+1;
		int nr=n;
		while(row<=nr)
		{
			//work
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*"+"\t");
			}
			int csp=2;
			if(row==1||row==n)
			{
				 csp=1;
			}
			
			for(;csp<nsp;csp++)
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


		
		//preperation
			
			System.out.println();
			
		if(row<=n/2)
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
