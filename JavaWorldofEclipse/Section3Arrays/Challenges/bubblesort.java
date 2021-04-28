package Challenges;
/*
sorting the array using bubble sort
 */
public class bubblesort {

	public static void main(String[] args) {
	
		bubble();

	}

	public static void bubble()
	{
//		int [] array= {12,43,34,23,43};
		int [] array = {1,2,4,5,6,7,8,9,3};
		
		for(int i=0;i<array.length-1;i++)
		{
			
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
			}
		}
	
	for(int ar:array)
	{
		System.out.println(ar);
	}
	}
}
