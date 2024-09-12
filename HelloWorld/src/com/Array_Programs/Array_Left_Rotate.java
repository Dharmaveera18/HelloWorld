package com.Array_Programs;

public class Array_Left_Rotate {

	public static void main(String[] args) {


		//Initialize the array
		int arr[] = new int[] {1,2,3,4,5};
		
		//n determine the no of times the array should rotate
		int n = 3;
		
		System.out.println("The original Array Elements are");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		//rotate the given array n times towards left
		for(int i=0; i<n; i++)
		{
			int j;
			
			int first = arr[0];
			
			for(j =0; j<arr.length-1; j++)
			{
				arr[j] = arr[j+1];
			}
			
			
			arr[j]=first;
			
		}

		System.out.println();
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
		}
	}

}
