package Section2Challenges;
/**

 Due to an immense rise in Pollution, Kejriwal is back with the Odd and Even Rule in Delhi. The scheme is as follows, each car will be allowed to run on Sunday if the sum of digits which are even is divisible by 4 or sum of digits which are odd in that number is divisible by 3. However to check every car for the above criteria can't be done by the Delhi Police. You need to help Delhi Police by finding out if a car numbered N will be allowed to run on Sunday?
 Sample Input
2
12345
12134

Sample Output
Yes
No


1 + 3 + 5 = 9 which is divisible by 3
1 + 1 + 3 = 5 which is NOT divisible by 3 and 2+4 = 6 which is not divisble by 4.
 
 */
import java.util.Scanner;

public class DelhisOddEven {

	public static void main(String[] args) {

		Scanner scn =new Scanner(System.in);
		System.out.println("enter n for ur pattern");
		 
		int n =scn.nextInt();

		for(int i=1;i<=n;i++)
		{
			int na=0;
			int even=0;
			int odd=0;
			int carnumber =scn.nextInt();
			
			
			while(carnumber!=0)
			{
				na=carnumber%10;
			if(na%2==0)
			{
				even=even+na;
			}
			else
			{
				odd=odd+na;
			}
			carnumber=carnumber/10;
		
		}

		if(odd%3==0||even%4==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		}
	}

}
