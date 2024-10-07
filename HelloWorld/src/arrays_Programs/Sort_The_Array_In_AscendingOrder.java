package arrays_Programs;

public class Sort_The_Array_In_AscendingOrder {

	public static void main(String[] args) {


		int arr[] = {7,4,3,2,5,6,1,0};
		
		int temp = 0;
		
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
				//For sorting array elements in descending order
				/*
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}*/
				
				
			}
		}
		
		System.out.print("Array Elements after sorting is :");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		

	}

}
