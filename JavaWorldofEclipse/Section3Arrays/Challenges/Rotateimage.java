package Challenges;
/**
 * 
Input Format
First line contains a single integer N. Next N lines contain N space separated integers.

Constraints
N < 1000

Output Format
Print N lines with N space separated integers of the rotated array.

Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Sample Output
4 8 12 16 
3 7 11 15 
2 6 10 14 
1 5 9 13 
Explanation
Rotate the array 90 degrees anticlockwise.
 **/
public class Rotateimage {

	public static void main(String[] args) {
		
int [][] array= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};


rotate(array);
	}

	public static void rotate(int[][] array)
	{
		int left=0;
		int top=0;
		int right=array[top].length-1;
	int bottom =array.length-1;
	int count=(right+1)*(bottom+1);
	
	while(count>0)
	{
		for(int i=right;i>=left;i--)
		{
			for(int j=top;j<=bottom;j++)
			{
				System.out.print(array[j][i]+" ");
				count--;
			}
		System.out.println();
		}
	}
	
	}
	
}
