package Section2Challenges;

import java.util.Scanner;
//Take the following as input.
//A number
//A digit
//Write a function that returns the number of times digit is found in the number. Print the value returned.



//Sample Input
//5433231 
//3
//Sample Output
//3
public class CountDigits {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		int n1 =scn.nextInt();	
		int n2=scn.nextInt();
		int n=0;
		int count=0;
		while(n1!=0)
		{
			n=n1%10;
			if(n==n2)
			{
				count++;
			}
			n1=n1/10;
		}
System.out.println(count);
	}

}
