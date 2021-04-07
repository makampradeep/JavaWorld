package Section2Challenges;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for printing reverse");
		
		int number =scn.nextInt();
		int reverse=0;
		int reminder=0;
		
while(number!=0)
{
	reminder=number%10;
	 reverse=reverse*10+reminder;
	 number=number/10;
	
}
System.out.println("reverse of the number you provided is "+reverse );
	}

}
