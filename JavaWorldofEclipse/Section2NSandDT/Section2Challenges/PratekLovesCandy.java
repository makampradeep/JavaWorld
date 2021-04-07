package Section2Challenges;

import java.util.Scanner;


//Prateek recently graduated from college. To celebrate, he went to a candy shop and bought all the candies. The total cost was a number upto which there are n prime numbers (starting from 2). Since Prateek wants to minimize his cost, he calls you to help him find the minimum amount that needs to be paid. Being a student of Prateek bhaiya it is now your job to help him out :)
//
//Input Format
//First line contains a single integer denoting the number of test cases T. Next T lines contains a single integer N, denoting the number of primes required.


//Sample Input
//2
//5
//1
//Sample Output
//11
//2
//Explanation
//In the first case there are 5 primes upto 11(2,3,5,7,11).


public class PratekLovesCandy {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		
		int n =scn.nextInt();
		int prime=0;
		for(int k=1;k<=n;k++)
		{
			 int count=0;
			int primenumber =scn.nextInt();
			
			
		for(int i=2;i<=Integer.MAX_VALUE;i++)
		{
			
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
			if(i%j==0)
					{
						flag=false;
						break;
					}
					}
		
		if(flag==true)
		{

			prime=i;
			
			count++;
			if(count==primenumber)
			{
				break;
			}
		}
		
		
		}
		
		System.out.println(prime);
	}
	}
}
