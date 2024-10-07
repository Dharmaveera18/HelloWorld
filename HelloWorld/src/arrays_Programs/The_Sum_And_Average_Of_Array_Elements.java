package arrays_Programs;

public class The_Sum_And_Average_Of_Array_Elements {

	public static void main(String[] args) {


		int arr[] = {1,2,3,4,5,7};
		int sum = 0;
		int len = arr.length;
		for(int i=0; i<len; i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("The sum of an Array Elements is : " + sum);
		float average = (float) sum / len;
		
		System.out.println("The Average of an Array Elements is : " + average);
		

	}

}
