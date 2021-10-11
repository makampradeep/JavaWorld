   
// 5	 	 	 	 	 	 	 	 	 	5	
// 5	4	 	 	 	 	 	 	 	4	5	
// 5	4	3	 	 	 	 	 	3	4	5	
// 5	4	3	2	 	 	 	2	3	4	5	
// 5	4	3	2	1	 	1	2	3	4	5	
// 5	4	3	2	1	0	1	2	3	4	5	
// 5	4	3	2	1	 	1	2	3	4	5	
// 5	4	3	2	 	 	 	2	3	4	5	
// 5	4	3	 	 	 	 	 	3	4	5	
// 5	4	 	 	 	 	 	 	 	4	5	
// 5	 	 	 	 	 	 	 	 	 	5




package Section2Challenges;

import java.util.Scanner;







public class PatternInvertedhourglass {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int nr=2*n+1;
		int nst=1;
		int row=1;
		int nsp=nr-2;
		
		while(row<=nr)
		{
			int val=n;
			for(int cst=1;cst<=nst;cst++)
			{
				
				System.out.print(val+"\t");
				val--;
			}
			
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" "+"\t");
			}
			int cst=1;
			if(row==nr/2+1)
			{
				cst=2;
				val++;
			}
			for(;cst<=nst;cst++)
			{
				val++;
				System.out.print(val+"\t");
			}
		System.out.println();
		if(row<=nr/2)
		{
			nst=nst+1;
			nsp=nsp-2;
			val=val-2;
		}
		else
		{
			nst=nst-1;
			nsp=nsp+2;
			
		}
		row++;
		}
		
		}

        }
