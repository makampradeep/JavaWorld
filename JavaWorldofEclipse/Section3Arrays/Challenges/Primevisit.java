package Challenges;

import java.util.Scanner;
/*

PMO gives two random numbers a & b to the Prime Minister. PM Modi wants to visit all countries between a and b (inclusive) , However due to shortage of time he can't visit each and every country , So PM Modi decides to visit only those countries,for which country number has two divisors. So your task is to find number of countries Mr. Modi will visit.

Sample Input
2
1 10
11 20
Sample Output
4
4
Explanation
PM Modi chooses countries with numbers 2,3,5 and 7 for the first testcase.
For the second testcase , he chooses countries with numbers 11,13,17 and 19.

 */
public class Primevisit {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			
			int a=scan.nextInt();
		
			int b=scan.nextInt();
		int totalprimes =findprime(a,b);
		System.out.println(totalprimes);
		}
	}


public static int findprime(int a ,int b)
{
	int count=0;
	
	for(int i=a;i<=b;i++)
	{
		boolean flag=true;
		
		for(int j=2;j<i;j++)
		{
			
		if(i%j==0)
		{
			flag=false;
			
		}
		
		}
	if(flag==true&&i!=1)
	{
		
		count++;
	}
	
	}
 return count;
}


}
