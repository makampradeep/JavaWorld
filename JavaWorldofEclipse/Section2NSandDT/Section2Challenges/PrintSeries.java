package Section2Challenges;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n1 =scn.nextInt();
		int n2 =scn.nextInt();
int n=0;
int x=0;
int count=0;
		while(count<n1)
		{

			
			if((3*n+2)%n2!=0&&(3*n+2)/n2!=0)
			{
				x=(3*n+2);
				
				System.out.println(x);
				
				count++;
			}
			n++;
		}
	}

}
