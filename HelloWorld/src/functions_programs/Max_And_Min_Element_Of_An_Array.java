package functions_programs;

public class Max_And_Min_Element_Of_An_Array {

	
	public static void main(String[] args) {

		int arr[] = {10,50,40,30,80};
		maximum_Element_In_an_Array(arr);
		minimum_Element_In_an_Array(arr);
	}

	public static void maximum_Element_In_an_Array(int[] arr) {
		
		int max = arr[0];
		
		for(int i = 1; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("Maximum element of an array is :"+max);
	}

	
   public static void minimum_Element_In_an_Array(int[] arr) {
		
		int min = arr[0];
		
		for(int i = 1; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("Minimum element of an array is :"+min);
	}
	
	
	
	
}
