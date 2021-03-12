import java.util.Scanner;

public class PrimeorNonPrime {

	public static void main(String[] args) {
		
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter your number to know if it is prime or non prime");
		int n =scn.nextInt();
         boolean flag=true;
		
		if(n>1)
		{
		for(int i=2;i<n;i++)
		{
		if(n%i==0)
		{
			System.out.println("number " +n+ " is not prime");
			flag=false;
			break;
		}
		
		
		}
		if(flag==true)
		{
			System.out.println("number " +n+ " is prime");
		}
		
		
		}
		else
		{
			System.out.println("number " +n+ " is neither prime nor composite");
		}
	}

}
