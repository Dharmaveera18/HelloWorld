package arrays_Programs;

public class Check_Array_Is_Sorted_In_Ascending_Order {

	public static void main(String[] args) {


		int arr1[] = {1,2,3,4,5};
		int arr2[] = {5,4,3,2,1};
		
		
		System.out.println("The array arr1 is sorted in ascending order : " + isArraySorted(arr1));
		
		System.out.println("The array arr1 is sorted in ascending order : " + isArraySorted(arr2));
		

	}

	public static boolean isArraySorted(int[] array)
    {
		
		for(int i = 0; i< array.length-1; i++)
		{
			if(array[i] > array[i+1])
			{
				return false;
			}
		}
		return true;
    }
}
