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

ans if n=5


1
11
202
3003
40004


*/
public class ManmohanLovesPatterns11 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int nst=1;
		int row=1;
		int val2=0;
		while(row<=n)
		{
			int val=row;
			//work
			if(row!=1)
			{
				val=row-1;
			}
			for(int cst=1;cst<=nst;cst++)
			{
				if(cst==1||cst==nst)
				{
			System.out.print(val);
				}
				else
				{
					System.out.print(val2);
				}
			
			}
//			preperation for next row
			
				System.out.println();
				row=row+1;
				nst=nst+1;

		}

	
	}
		

}


