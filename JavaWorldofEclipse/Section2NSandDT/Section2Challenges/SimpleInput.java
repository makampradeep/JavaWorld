package Section2Challenges;

import java.util.Scanner;

/**
 * 
 * Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.
 * 
 
 Sample Input
1
2
88
-100
49


Sample Output
1
2
88
 
 
 
 *
 */
public class SimpleInput {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
        int sum = 0;

        while(sum >= 0)
        {

            int n = scn.nextInt();
            sum =sum+ n;

            if(sum < 0)
            	break;
            System.out.println(n);
        }
    }
		

	}


