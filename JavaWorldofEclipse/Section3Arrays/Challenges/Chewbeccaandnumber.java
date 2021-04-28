package Challenges;

import java.util.Scanner;
/*

Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.

Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.


Sample Input
4545
Sample Output
4444


 */
public class Chewbeccaandnumber {

	public static void main(String[] args) {
	
		Scanner scan =new Scanner(System.in);
		System.out.println("enter number");
		long number=scan.nextLong();
		
		long sum=invertornot(number);
		System.out.println(sum);
		

	}

	public static long invertornot(long number)
	{
		long sum1=0;
		long sum=0;
		long n=number;
		while(n!=0)
		{
			long m=n%10;
			if(m!=9)
			{
			if(m>9-m)
			{
				m=9-m;
			}
			}
		sum=sum*10+m;
		n=n/10;
		}
		while(sum!=0)
		{
			long x=sum%10;
			
	
		sum1=sum1*10+x;
		sum=sum/10;
		}
	return sum1;
	}
	
}
