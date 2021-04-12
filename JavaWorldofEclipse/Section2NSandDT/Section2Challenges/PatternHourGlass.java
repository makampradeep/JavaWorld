package Section2Challenges;

import java.util.Scanner;
/**
 * 
 * pattern wn n=5
5	4	3	2	1	0	1	2	3	4	5	
 	4	3	2	1	0	1	2	3	4	
 	 	3	2	1	0	1	2	3	
 	 	 	2	1	0	1	2	
 	 	 	 	1	0	1	
 	 	 	 	 	0	
 	 	 	 	1	0	1	
 	 	 	2	1	0	1	2	
 	 	3	2	1	0	1	2	3	
 	4	3	2	1	0	1	2	3	4	
5	4	3	2	1	0	1	2	3	4	5	

 * @author prade
 *
 */
public class PatternHourGlass {

	public static void main(String[] args) {
	
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int nr=2*n+1;
		int nst=nr;
		int row=1;
		int nsp=1;
		int val=n;
		while(row<=nr)
		{
			
			int cst=1;
			for(int csp=1;csp<nsp;csp++)
			{
				System.out.print(" "+"\t");
			}
			
			for(;cst<=nst;cst++)
			{
				
				
				System.out.print(val+"\t");
				if(cst<nst/2+1)
				{
					val--;
				}
				else
				{
					val++;
				}
			}
			
			
			
		
		System.out.println();
		if(row<nr/2+1)
		{
			nst=nst-2;
			nsp=nsp+1;
			val=val-2;
		}
		else
		{
			nst=nst+2;
			nsp=nsp-1;
			
		}
		
		row++;
		
		
		}
		
		

	}

}
