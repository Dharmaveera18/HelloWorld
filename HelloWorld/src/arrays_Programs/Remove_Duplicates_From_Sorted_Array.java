package arrays_Programs;

public class Remove_Duplicates_From_Sorted_Array {

	public static void main(String[] args) {


		int arr[] = {1,2,2,3,3,3,4,4,5};
		int len = arr.length;
		
		System.out.print("Array Elements before removing the duplicates : ");
		for(int i=0; i<len; i++)
		{
			System.out.print(arr[i]);
		}
		
		
		
		int temp[] = new int [len];
		int j = 0;
		
		for(int i = 0; i < len-1; i++)
		{
			if(arr[i] != arr[i+1])
            {
				temp[j] = arr[i];
				j++;
            }

		}
		temp[j] = arr[len-1];
		j++;     // Increase j as we added the last element

		
		
		System.out.println();
		System.out.print("Array Elements after the removing duplicates : ");
		for(int i=0; i<j; i++) // Only print the elements up to index j
		{
			System.out.print(temp[i]);    
		}
		
	}

}
