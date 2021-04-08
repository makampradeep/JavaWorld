package Section2Challenges;

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
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4


*/
public class PatternTriangle {

	public static void main(String[] args) {
	
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();	
		
		int nsp=n-1;
		int nst=1;
		int row=1;
		
		while(row<=n)
		{
			int val=row;
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" "+"\t");
			}
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print(val+"\t");
				if(cst<nst/2+1)
				{
					val++;
				}
				else
				{
					val--;
				}
				
			}
		
		System.out.println();
		nsp=nsp-1;
		nst=nst+2;
		
		row++;
		
		}

	}

}
