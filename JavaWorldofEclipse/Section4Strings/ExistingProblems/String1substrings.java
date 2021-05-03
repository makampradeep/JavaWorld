package ExistingProblems;

import java.util.Scanner;

public class String1substrings {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string you want to substring on");
		String n=scan.nextLine();
		
		substrings(n);
		
//string time complexity is o(n(square))
		//substring time complexity is o(n)
		
		//so string builder is used since value can be changed at the original position
	}

	
	public static void substrings(String n)
	{
		for(int si=0;si<n.length();si++)
		{
			for(int ei=si+1;ei<=n.length();ei++)
			{
				System.out.println(n.substring(si, ei));
			}
		}
	}
}
