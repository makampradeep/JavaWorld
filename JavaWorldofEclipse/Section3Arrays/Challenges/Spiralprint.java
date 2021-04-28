package Challenges;
/**

Take as input a 2-d array.Print the 2-D array in sprial form clockwise.

Input Format
Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).

Constraints
Both M and N are between 1 to 10.

Output Format
All M * N integers separated by commas with 'END' written in the end(as shown in example).

Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 12, 13, 14, 24, 34, 44, 43, 42, 41, 31, 21, 22, 23, 33, 32, END
Explanation
For spiral level clockwise traversal, Go for first row-> last column ->last row -> first column and then do the same traversal for the remaining matrix .




 */
public class Spiralprint {
public static void main(String[] args) {
	
	spiral();
	
}
public static void spiral()
{
	int[][] array= {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
	
	int top=0;
	int left=0;
	int right=array[top].length-1;
	int bottom =array.length-1;
	int dir=1;
	int count=(right+1)*(bottom+1);
	
	
while(left<=right&&top<=bottom)
{
	if(count>0)
	{
		if(dir==1)
		{
		for(int i=left;i<=right;i++)
		{
			System.out.print(array[top][i]+" ");
			count--;
		}
		top++;
		dir=2;
		}
	
	
	}

if(count>0)
{
	if(dir==2)
	{
		for(int i=top;i<=bottom;i++)
		{
			System.out.print(array[i][right]+" ");
			count--;
		}
		dir=3;
	right--;
	
	
	}
}
if(count>0)
{
	if(dir==3)
	{
		for(int i=right;i>=left;i--)
		{
		System.out.print(array[bottom][i]+" ");	
		count--;
		}
	
	dir=4;
	bottom--;
	}
}
if(count>0)
{
	if(dir==4)
	{
		for(int i=bottom;i>=top;i--)
		{
		System.out.print(array[i][left]+" ");	
		count--;
		}
	dir=1;
	left++;
	}
}




}}
	
	
	
	
	




}
