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


Take N (number of rows), print the following pattern (for N = 4)

Sample Input
4
Sample output

0	
1	1	
2	3	5	
8	13	21	34


*/

public class FibonacciPattern {

	public static void main(String[] args) {
		
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int first=0;
		int second=1;
		int sum=0;
		int row=1;
		int nst=1;



		while(row<=n)
		{
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print(first+"\t");
				sum=first+second;
				first=second;
				second=sum;
				
			}
			System.out.println();
			row++;
			nst=nst+1;
		}
		
		
		
	}


	
	{
		
	}
	
	
}
