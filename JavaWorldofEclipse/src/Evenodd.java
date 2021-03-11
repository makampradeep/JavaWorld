import java.util.Scanner;

public class Evenodd {
	
	

	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter your number to know if it is even or odd");
		int n =scn.nextInt();
	
		
			if(n%2==0)
			{
				System.out.println("number is even");
			}
			else
			{
				System.out.println("number is odd");
			}
		
		
		
		

	}

}
