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


5	4	3	2	*	
5	4	3	*	1	
5	4	*	2	1	
5	*	3	2	1	
*	4	3	2	1


 */
public class Ques31 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int xal=1;
		int nst=n;
		
		for(int row=1;row<=n;)
		{
			int val=n;
			
			//work
			
			for(int cst=1;cst<=nst;cst++)
			{
				if(val==xal)
				{
					System.out.print("*"+"\t");	
				}
				else
				{
			System.out.print(val+"\t");
				}
			val--;
			}
		
//		preperation for next row
			
			System.out.println();
			row=row+1;
			xal++;
		}
		

		

	}

}
