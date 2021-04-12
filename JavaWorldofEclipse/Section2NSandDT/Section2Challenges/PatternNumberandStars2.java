package Section2Challenges;

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
 
ans if n=7


1******
12*****
123****
1234***
12345**
123456*
1234567


 */
public class PatternNumberandStars2 {

	public static void main(String[] args) {
		
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int nst=n;
		
		for(int row=1;row<=n;)
		{
			int val=1;
			
			//work
			
			for(int cst=1;cst<=nst;cst++)
			{
				if(val<=row)
				{
					System.out.print(val);
					val++;
				}
				else
				{
			System.out.print("*");
				}
		
			}
		
//		preperation for next row
			
			System.out.println();
			row=row+1;
			
		}
		

		

	}

}
