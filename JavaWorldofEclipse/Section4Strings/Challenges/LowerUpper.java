package Challenges;
/****
 * 
Print "lowercase" if user enters a character between 'a-z' , Print "UPPERCASE" is character lies between 'A-Z' and print "Invalid" for all other characters like $,.^# etc.

Input Format
Single Character .

Constraints
-

Output Format
lowercase UPPERCASE Invalid

Sample Input
$
Sample Output
Invalid
Explanation
-
 * 
 */
import java.util.Scanner;

public class LowerUpper {

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
				System.out.println("lowercase");
				
			}
			else if(ch==ch2[j])	
			{
				flag=true;
				System.out.println("UPPERCASE");
			}
			

		

			}
		if(flag==false)
		{
			System.out.println("Invalid");

		}
	
	}

	
	
	
}
