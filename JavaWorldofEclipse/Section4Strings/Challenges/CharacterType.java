package Challenges;

import java.util.Scanner;
/**
Take the following as input.

A character (ch) Write a function that returns ‘U’, if it is uppercase; ‘L’ if it is lowercase and ‘I’ otherwise. Print the value returned.

Input Format
Character (ch)

Constraints
No constraints

Output Format
'L' (if ch is lower-case) 'U' (if ch is upper-case) 'I' (otherwise)

Sample Input
s
Sample Output
L
Explanation
Anyone can Do it using Ascii codes. I dare you - "Try to not use ascii codes." ;)
 *
 */
public class CharacterType {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
System.out.println("enter character");
		char ch = scan.next(). charAt(0);
		char[] ch1= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
				
		char[] ch2= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		boolean flag=false;
		for(int i = 0,j=0;i<ch1.length||j<ch2.length;i++,j++)
		{
			if(ch==ch1[i])
			{
				flag=true;
				System.out.println("L");
				
			}
			else if(ch==ch2[j])	
			{
				flag=true;
				System.out.println("U");
			}
			
		}

		if(flag==false)
		{
			System.out.println("I");

		}

			}

	}


