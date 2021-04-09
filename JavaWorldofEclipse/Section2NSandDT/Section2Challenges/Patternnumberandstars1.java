package Section2Challenges;

import java.util.Scanner;


//ans
//
//1	2	3	4	5	
//1	2	3	4	*	
//1	2	3	*	*	*	
//1	2	*	*	*	*	*	
//1	*	*	*	*	*	*	*
public class Patternnumberandstars1 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();	
		int row=1;
		int nsp=n-1;
		int nst=1;
		int val=1;
		int nsn=n;
		while(row<=n)
		{
			int val2=1;
			if(row==1)
			{
				for(int csn=1;csn<=nsn;csn++)
				{
				System.out.print(val2+"\t");
				val2++;
				}
			}
			
			else
			{
			for(int csp=1;csp<=nsp;csp++)
			{
				
				
				
				System.out.print(val2+"\t");
				val2++;
			}	
			for(int cst=1;cst<=nst;cst++)
			{
				
				
				
				System.out.print("*"+"\t");
				
			}
			
			}
		
		System.out.println();
		
			if(row!=1)
			{
				nst=nst+2;
				nsp=nsp-1;
				val++;
			}
			row++;
		}
			
	}

	}


