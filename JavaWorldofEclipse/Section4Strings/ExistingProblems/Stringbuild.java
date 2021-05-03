package ExistingProblems;

import java.util.Scanner;

public class Stringbuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuilder str=new StringBuilder("hello");
		
		//to update a value at particulat position 
		
		str.setCharAt(2, 'i');
		System.out.println(str);
		
		
		str.insert(3, 'b');
		System.out.println(str);
		str.insert(5, "ss");
		System.out.println(str);
		str.append("sa");
		System.out.println(str);
		
		str.deleteCharAt(2);
		System.out.println(str);
		
		
		//StringBuilder to string conversion
		StringBuilder sb=new StringBuilder("hello");
		String s =sb.toString();
		//string to stringbuilder
		String st="bye";
		StringBuilder sr =new StringBuilder(st);
		System.out.println(sr);
		
		//take input of stringbuilder from scanner
		
		Scanner scn=new Scanner(System.in);
		String str1=scn.nextLine();
		StringBuilder sb1=new StringBuilder(str1);
		//here using sb1 we can take input
		
		
		
		
	}

}
