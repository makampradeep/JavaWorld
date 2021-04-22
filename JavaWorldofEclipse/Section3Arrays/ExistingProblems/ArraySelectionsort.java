package ExistingProblems;

public class ArraySelectionsort {

	public static void main(String[] args) {
	
		int [] array= {12,45,65,43,23};
		int[] arr=Selectionsort(array);

		for(int a:arr)
		{
			System.out.print(a+"\t");
		}
	
	}

	public static int[] Selectionsort(int[] array)
	{
		for(int counter=0;counter<array.length-1;counter++)
		{
			int min=counter;
			for(int j=counter+1;j<array.length;j++)
			{
				if(array[j]<array[min])
				{
					min=j;
				}
			}
		
		int temp=array[min];
		array[min]=array[counter];
		array[counter]=temp;
		}
	
	return array;
	}
}
