package arrays_Programs;

public class Smallest_Number_In_Array {

	public static void main(String[] args) {


		int arr[] = {10,20,40,5,90,45};
		
		int min = arr[0];
		
		for(int i = 1; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
 
		System.out.println("The Smallest Number in an Array is : " + min);
		
	}

}
