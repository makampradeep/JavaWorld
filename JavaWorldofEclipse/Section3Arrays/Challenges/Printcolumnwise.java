package Challenges;
/*****

Take as input a two-d array. Wave print it column-wise.

Input Format
Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).

Constraints
Both M and N are between 1 to 10.

Output Format
All M * N integers seperated by commas with 'END' wriiten in the end(as shown in example).

Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14, END

 */
public class Printcolumnwise {

	public static void main(String[] args) {
	
		
		int[][] array= {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		
		columnwise(array);
	}

	
	public static void columnwise(int[][] array)
	{
		int left=0;
		int top=0;
		int right=array[top].length-1;
		int bottom=array.length-1;
		int count=(right+1)*(bottom+1);
				
		while(count>0)
		{
		
				
					for(int j=left;j<=right;j++)
					{
						if(left%2==0)
						{
						for(int i=top;i<=bottom;i++)
						{
					System.out.print (array[i][left]+",");
					count--;
					}
						left++;
					}
						else
						{
						for(int i=bottom;i>=top;i--)
						{
					System.out.print (array[i][left]+",");
					count--;
					}
						left++;
					}
					
						
					
					}
					
					
					System.out.println("END");
			}
	
	}
	}
	

