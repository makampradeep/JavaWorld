package ExsistingProblens3DArray;

public class WavePrint {

	public static void main(String[] args) {
		
		int [][] array= {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		
		printwave(array);
		

	}

	public static void printwave(int[][] array)
	{
		for(int i=0;i<array.length;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<array[i].length;j++)
				{
					System.out.print(array[i][j]+" ");
				}
			}
				else
				{
					for(int j=array[i].length-1;j>=0;j--)
					{
						System.out.print(array[i][j]+" ");
					}	
				}
			
			}
		System.out.println("END");
	
	}
	}
	
	

