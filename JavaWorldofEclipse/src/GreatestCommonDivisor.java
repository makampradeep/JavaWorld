import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter your divident ");
		int divident =scn.nextInt();
		System.out.println("enter your divisor ");
		int divisor =scn.nextInt();
		int reminder=0;
		
		
		while(divident%divisor!=0)
		{
			reminder=divident%divisor;
			divident=divisor;
			divisor=reminder;
			
					
					
		}
	
	System.out.println(divisor);
	System.out.println("GCD of two numbers is "+divisor);
	}

	
	
}
