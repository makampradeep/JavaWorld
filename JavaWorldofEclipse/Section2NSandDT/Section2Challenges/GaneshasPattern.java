package Section2Challenges;

import java.util.Scanner;
/**



Take as input N, an odd number (>=5) . Print the following pattern as given below for N = 7.

*  ****
*  *
*  *
*******
   *  *
   *  *
****  *
Input Format
Enter value of N ( >=5 )


here we followed particular notes 

n/2-1 for spaces 
n/2 for stars
n/2+1 for full line in middle

in first row
stars 1 ,spaces  n/2-1 for spaces  for stars n/2+1
 in second row 
stars 1 spaces n/2-1 for spaces stars 1
third row
stars 1 spaces n/2-1 for spaces stars 1
fourth row
all stars 
fifth sixth row
3 spaces =n/2  1star  2 spaces n/2-1 for spaces 1 star 

seventh row
n/2+1 stars n/2-1 spaces 1 star
*/
public class GaneshasPattern {

	public static void main(String[] args) {
	
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();	
		int row=1;
		int nst=n/2+1;
		int nsp=n/2-1;
		int nst1=1;
		int nsp1=n/2-1;
		while(row<=n)
		{
			if(row==1)
			{
			for(int cst=1;cst<=nst1;cst++)
			{
				System.out.print("*");
			}
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*");
			}
			}
			
			if(row<=n/2&&row>1)
			{
				for(int cst=1;cst<=nst1;cst++)
				{
					System.out.print("*");
				}
				for(int csp1=1;csp1<=nsp1;csp1++)
				{
					System.out.print(" ");
				}
				for(int cst=1;cst<=nst1;cst++)
				{
					System.out.print("*");
				}
				for(int csp1=1;csp1<=nsp1+1;csp1++)
				{
					System.out.print(" ");
				}
			}
				if(row==n/2+1)
				{
					for(int cst=1;cst<=n;cst++)
					{
						System.out.print("*");
					}
			
				}
			if(row>n/2+1&&row!=n)
			{
				for(int csp1=1;csp1<=nsp1+1;csp1++)
				{
					System.out.print(" ");
				}
				for(int cst=1;cst<=nst1;cst++)
				{
					System.out.print("*");
				}
				for(int csp1=1;csp1<=nsp1;csp1++)
				{
					System.out.print(" ");
				}
				for(int cst=1;cst<=nst1;cst++)
				{
					System.out.print("*");
				}
			}
			
			if(row==n)
			{

				for(int cst=1;cst<=nst;cst++)
				{
					System.out.print("*");
				}
				for(int csp=1;csp<=nsp;csp++)
				{
					System.out.print(" ");
				}
				for(int cst=1;cst<=nst1;cst++)
				{
					System.out.print("*");
				}
			}
			
			System.out.println();
			row++;
			
			
			}
			
				
		
		
	}

}
