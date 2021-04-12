package Section2Challenges;

import java.util.Scanner;
/*pattern when n=7

7
                       
 	 	                                         
 	 	 	 	 	 	1	
 	 	 	 	2	1	 	1	2	
 	 	3	2	1	 	 	1	2	3	
4	3	2	1	 	 	 	1	2	3	4	
 	 	3	2	1	 	 	1	2	3	
 	 	 	 	2	1	 	1	2	
 	 	 	 	 	 	1	










*/	
public class Patterndoublesidedarrow {

	public static void main(String[] args) {
	
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int row=1;
		int nsp=n-1;
		int nst=1;
		int nst1=1;
		int nsp1=1;
		
		while(row<=n)
		{
			int val=row;
			if(row<=n/2)
			{
			 val=row;
			}
			else
			{
				val=n-row+1;
			}
		for(int csp=1;csp<=nsp;csp++)
		{
			System.out.print(" "+"\t");
		}
		for(int cst=1;cst<=nst;cst++)
		{
			
			System.out.print(val+"\t");
			val--;
		}
		for(int csp=1;csp<nsp1;csp++)
		{
			System.out.print(" "+"\t");
		}
		int cst=1;
		if(row==1||row==n)
		{
			 cst=2;
		}
		
		for(;cst<=nst1;cst++)
		{
			val++;
			System.out.print(val+"\t");
			
		}
		
		System.out.println();
		if(row<=n/2)
		{
		nst=nst+1;
		nst1=nst1+1;
		nsp=nsp-2;
		nsp1=nsp1+1;
		val++;
		}
		else
		{
			nst=nst-1;
			nsp=nsp+2;
			nst1=nst1-1;
			nsp1=nsp1-1;
		}
		row++;
		
		
		}
	
	
	}

}
