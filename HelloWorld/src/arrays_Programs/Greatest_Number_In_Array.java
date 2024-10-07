package arrays_Programs;

public class Greatest_Number_In_Array {

	public static void main(String[] args) {


		int arr[]  = {1,5,4,2,8,6};
		
		int max = arr[0];
		
		for(int i = 1; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		

		System.out.println("The Greatest no in an Array is : " + max);
		
		
	}

}
