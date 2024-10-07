package arrays_Programs;

public class Check_If_Array_Is_An_Empty_Or_Not {

	public static void main(String[] args) {


		int arr1[] = {};
		
		int arr2[] = {1,2,3,4,5};
		
		System.out.println("The arr1 array is empty ? : " + isArrayEmpty(arr1));
		System.out.println("The arr2 array is empty ? : " + isArrayEmpty(arr2));

	}
	
	public static boolean isArrayEmpty(int[] array)
	{
		return array.length == 0;
	}

}
