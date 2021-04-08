package Section2Challenges;

import java.util.Scanner;

/**

Take the following as input.

A number
Write a function which returns true if the number is an armstrong number and false otherwise, where Armstrong number is defined as follows.

A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if.

abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….

1634 is an Armstrong number as 1634 = 1^4 + 6^4 + 3^4 + 4^4

371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

Input Format
Single line input containing an integer

Sample Input
371
Sample Output
true
Explanation
Use functions. Write a function to get check if the number is armstrong number or not. Numbers are armstrong if it is equal to sum of each digit raised to the power of number of digits.	
 */


public class IsArmStrongNumbers {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n1 for calculating armstrong number");
		int n1 =scn.nextInt();	

		int n=0;
		int reverse=0;
		int count=0;
		int n3=n1;
		int x=0;
		double armstrong=0;
		while(n3!=0)
		{
			n=n3%10;
			reverse=reverse*10+n;
				count++;
		
			n3=n3/10;
			
			
			
		}

		
		while(reverse!=0)
		{
			x=reverse%10;
			
			armstrong=armstrong+Math.pow(x, count);
		  
			reverse=reverse/10;
			
			
			
		}
		int armstrongValue = (int) armstrong;
	  System.out.println(n1);
	    if(n1==armstrongValue)
	    {
	    	System.out.println("true");
	    }
	    else
	    {
	    	System.out.println("false");
	    }
	}

}
