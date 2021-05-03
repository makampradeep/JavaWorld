package Challenges;

import java.util.Scanner;
/*
Take as input S, a string. Write a function that returns true if the string is a palindrome and false otherwise. Print the value returned.

Input Format
String

Constraints
String length between 1 to 1000 characters

Output Format
Boolean

Sample Input
abba
Sample Output
true
Explanation
A string is said to be palindrome if reverse of the string is same as string. For example, “abba” is palindrome as it's reverse is "abba", but “abbc” is not palindrome as it's reverse is "cbba".
 */
public class Palindrome {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the string");
		
		String str=scan.nextLine();
		boolean flag=palindrom(str);
		System.out.println(flag);
		

	}
public static boolean palindrom(String str)
{
	boolean flag=true;
	
	
	String reverse="";
	for(int i=str.length()-1;i>=0;i--)
	{
		reverse=reverse+str.charAt(i);
	}
	System.out.println(reverse);
if(str.equals(reverse))
{
	return flag;
}
else
{
	
	return false;
}

}
}
