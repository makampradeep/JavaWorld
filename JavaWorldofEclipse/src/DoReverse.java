import java.util.Scanner;

public class DoReverse {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter your number you want to reverse");
		int number =scn.nextInt();
		int reverse=0;
		int reminder=0;
		while(number%10!=0||number/10!=0)
		{
			 reminder=number%10;
			 reverse=reverse*10+reminder;
			 number=number/10;
			 
		}
System.out.println("reverse of the number you provided is "+reverse );
	}

}
