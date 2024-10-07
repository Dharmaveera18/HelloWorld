package arrays_Programs;

public class Intersection_Of_Two_Arrays {

	public static void main(String[] args) {


		int arr1[] = {1,5,4,6,7,8,9};
		
		int arr2[] = {1,3,5,6,4,4};
		
		
		for(int i = 0; i<arr1.length; i++)
		{
			for(int j = 0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.print(arr1[i]);
					break;
				}
			}
		}
		
		

	}

}
