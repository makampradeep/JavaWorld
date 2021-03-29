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
 	 	 	2	3	4	
 	 	5	6	7	8	9	
 	10	11	12	13	14	15	16	
17	18	19	20	21	22	23	24	25


*/
public class Pattern25 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();	
		int row=1;
		int nsp=n-1;
		int nst=1;
		int val=1;
		while(row<=n)
		{
			
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" "+"\t");
			}	
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print(val+"\t");
				val++;
			}
			
			
		System.out.println();
		
			
				nst=nst+2;
				nsp=nsp-1;
				
			row++;
		}
			

	}

}
