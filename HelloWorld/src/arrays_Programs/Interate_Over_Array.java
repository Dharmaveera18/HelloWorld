package arrays_Programs;

public class Interate_Over_Array {

	public static void main(String[] args) {


		int arr[] = {10,20,30,40,50};
		
		//Using for loop
		System.out.print("Using for loop :");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		System.out.println();
		
		
		//Using enhanced for loop
		System.out.print("Using enhanced for loop : ");
		for(int i : arr)
		{
			System.out.print(i + " ");
		}

		
		System.out.println();
		
	
		//using while loop
		System.out.print("Using while loop : ");
		int i = 0;
		while(i < arr.length)
		{
			System.out.print(arr[i] + " ");
			i++;
		}
		
	}

}
