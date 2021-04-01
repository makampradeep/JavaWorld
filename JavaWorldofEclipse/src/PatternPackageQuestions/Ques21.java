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


*	 	 	 	 	 	 	 	*	
*	*	 	 	 	 	 	*	*	
*	*	*	 	 	 	*	*	*	
*	*	*	*	 	*	*	*	*	
*	*	*	*	*	*	*	*	*	


*/
public class Ques21 {

	public static void main(String[] args) {
	
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int row=1;
		
		int nst=1;
		int nr=2*n-1;
		int nsp=nr-2;
		while(row<=n)
		{
			//work
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*"+"\t");
			}
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" "+"\t");
			}
			int cst=1;
			if(row==n)
			{
				cst=2;
			}
			for(;cst<=nst;cst++)
			{
				System.out.print("*"+"\t");
			}		
		System.out.println();
		nst=nst+1;
		nsp=nsp-2;
		row++;
		}
		

	}

}
