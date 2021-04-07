package Section2Challenges;

import java.util.Scanner;
//Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".
public class CheckPrime {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n to find if it is prime ");
		int n =scn.nextInt();	
		boolean flag=true;
		for(int i=2;i<n;i++)
		{
			
				if(n!=2)
				{
					if(n%i==0)
					{
						flag=false;
						break;
				}
			}
		
		
		}
		if(flag==true)
		{
			System.out.println(n+" is prime");
		}
		else
		{
			System.out.println(n+" is not prime");
		}
	}

}
