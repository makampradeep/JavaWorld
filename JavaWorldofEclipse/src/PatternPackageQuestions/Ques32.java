package PatternPackageQuestions;

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
 
ans if n=5


1	
2	*	2	
3	*	3	*	3	
4	*	4	*	4	*	4	
5	*	5	*	5	*	5	*	5	
4	*	4	*	4	*	4	
3	*	3	*	3	
2	*	2	
1	


 */
public class Ques32 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int nst=1;
		int row=1;
		int val=1;
		
		int nr=2*n-1;
		while(row<=nr)
		{
			
		for(int cst=1;cst<=nst;cst++)
		{
			if(cst%2!=0)
			{
				System.out.print(val+"\t");
			}
			else
			{
			System.out.print("*"+"\t");
			}
		}
	
		System.out.println();
		if(row<=nr/2)
		{
		nst=nst+2;
		val++;
		}
		else
		{
			nst=nst-2;
			val--;
		}
		row++;
		}
	
	
	
	}
}
