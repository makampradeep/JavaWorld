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

ans if n=5 and with 1


1     1
12   21
123 321
1234321


*/
import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n =scn.nextInt();
		int row=1;
		
		int nst=1;
		
		int nr=2*n-1;
		int nsp=nr-2;
		System.out.println(nsp);
		while(row<=n)
		{
			int val=1;
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print(val);
				val++;
			}
		for(int csp=1;csp<=nsp;csp++)
		{
			System.out.print(" ");
		}
		int cst=1;
		if(row==n)
		{
			cst=2;
			val--;
		}
		for(;cst<=nst;cst++)
		{
			
			val--;	
			System.out.print(val);
			
		}
		System.out.println();
		row++;
		nst=nst+1;
		nsp=nsp-2;
		
		}

	}

}
