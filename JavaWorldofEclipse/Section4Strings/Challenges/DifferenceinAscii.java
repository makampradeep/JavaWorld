package Challenges;

import java.util.Scanner;
/***
Take as input S, a string. Write a program that inserts between each pair of characters the difference between their ascii codes and print the ans.

Input Format
String

Constraints
Length of String should be between 2 to 1000.

Output Format
String

Sample Input
acb
Sample Output
a2c-1b
Explanation
For the sample case, the Ascii code of a=97 and c=99 ,the difference between c and a is 2.Similarly ,the Ascii code of b=98 and c=99 and their difference is -1. So the ans is a2c-1b.
 */
public class DifferenceinAscii {

	public static void main(String[] args) {
	
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the string");
		
		String str=scan.nextLine();
		String str1=difinascii(str);
		System.out.println(str1);
	}

	
	public static String difinascii(String str)
	{
		StringBuilder sb=new StringBuilder(" ");
		
		for(int i=0;i<str.length();i++)
		{
		if(i<str.length()-1)
		{
			
		int ascii2 = (int) str.charAt(i);
		int ascii1 = (int) str.charAt(i+1);
		int as=ascii1-ascii2;


		sb=sb.append(str.charAt(i));
		sb.append(as);
		}
		else
		{
			sb.append(str.charAt(str.length()-1));
		}
		
		}
		return sb.toString();
	}
}
