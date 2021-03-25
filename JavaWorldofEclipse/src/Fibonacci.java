import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter your number to know if it is even or odd");
		int n =scn.nextInt();
		int fibonacci=0;
		int first=0;
		int second=1;
		for(int i=0;i<=n;i++)
		{
			
			fibonacci=fibonacci+first;
			first=second;
			second=fibonacci;
		}
		
		System.out.println("the "+ n +" fibonacci number in fibonacci series is "+fibonacci);

	}

}
