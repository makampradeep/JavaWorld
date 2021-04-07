package Section2Challenges;
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
2	2	
3	0	3	
4	0	0	4	
5	0	0	0	5	


*/
import java.util.Scanner;

public class PatternWithZeroes {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for your pattern");
		
		int n =scn.nextInt();
		int row=1;
		int nst=1;
	
		while(row<=n)
		{
			int val=row;
			for(int cst=1;cst<=nst;cst++)
			{
				if(cst==1||cst==nst)
				{
				System.out.print(val+"\t");
				}
				else
				{
					System.out.print("0"+"\t");
				}
			}
		System.out.println();
		nst++;
		row++;
		}

	}

}
