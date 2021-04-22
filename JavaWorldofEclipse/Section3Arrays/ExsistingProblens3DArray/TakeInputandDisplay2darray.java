package ExsistingProblens3DArray;

import java.util.Scanner;

public class TakeInputandDisplay2darray {

	public static void main(String[] args) {
		
	int[][] array=	Takeinput();
	Displayarray(array);

	}

	
	private static int[][] Takeinput()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter total no of rows in array");
		int rows=scan.nextInt();
		int [] [] array=new int[rows][];
		
		for(int row=0;row<rows;row++)
		{
			System.out.println("Enter total no of columns in array");
			int cols=scan.nextInt();
			array[row] =new int[cols];
			
			for(int col=0;col<cols;col++)
			{
				System.out.println("enter the value of row"+row+"and col"+col);
				array[row][col]=scan.nextInt();
			}
		System.out.println();
		}
		
		return array;
		
	}


	private static void  Displayarray(int[][] array)
	{
		for(int row=0;row<array.length;row++)
		{
			for(int col=0;col<array[row].length;col++)
			{
				System.out.print(array[row][col]+"\t");
			}
		System.out.println();
		}
	}





}
