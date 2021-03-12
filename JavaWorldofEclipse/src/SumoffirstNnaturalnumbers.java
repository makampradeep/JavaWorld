import java.util.Scanner;

public class SumoffirstNnaturalnumbers {

	public static void main(String[] args) {
		
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter your number N so it gives you sum of all natural numbers up to N");
		int N =scn.nextInt();
		int sum=0;
		for(int counter=1;counter<=N;counter++)
		{
			sum=sum+counter;
		}
		
System.out.println("value of sum is "+sum);
	}

}
