package NumberPatterns;

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

ans if n=5 and with 1


 	 	 	 	1	
 	 	 	1	2	1	
 	 	1	2	3	2	1	
 	1	2	3	4	3	2	1	
1	2	3	4	5	4	3	2	1


*/
public class Pattern27 {

	public static void main(String[] args) {
	
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();	
		int row=1;
		int nsp=n-1;
		int nst=1;
		int val;
		while(row<=n)
		{
			val=1;
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" "+"\t");
			}	
			int cst=1;
			
			for(;cst<=nst;cst++)
			{
				System.out.print(val+"\t");
				if(cst<=nst/2)
				{
					val++;
				}
				else
				{
					val--;
				}
				
				
			}
			
			
		System.out.println();
		
			
				nst=nst+2;
				nsp=nsp-1;
				
			row++;
		}
			
		
		

	}

}
