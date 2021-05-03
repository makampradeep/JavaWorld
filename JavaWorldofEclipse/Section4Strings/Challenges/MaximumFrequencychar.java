package Challenges;

import java.util.ArrayList;
import java.util.Scanner;

import ExistingProblems.charat;
/*
Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.

Input Format
String

Constraints
A string of length between 1 to 1000.

Output Format
Character

Sample Input
aaabacb
Sample Output
a
Explanation
For the given input string, a appear 4 times. Hence, it is the most frequent character.




 */
public class MaximumFrequencychar {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string o find max occurances");
		String st=scan.nextLine();
		char ch=maxfreq(st);
		System.out.println(ch);
	}

	public static char maxfreq(String str)
	{
		
		
		int sum=0;
	char num=0;
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==str.charAt(i))
				{
					count++;
				}
			if(j<i&&str.charAt(j)==str.charAt(i))
			{
				break;
			}
			
			if(j==str.length()-1&&sum<count)
			{
				sum=count;
				num=str.charAt(i);
			
			}
			
			}
		
		}
	
     return num;
	
	}
}
