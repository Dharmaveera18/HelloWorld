package functions_programs;

public class Sort_An_Array_Bobble_Sort {

	
	public static void main(String[] args) {

		int arr[] = {10,50,40,30,80};
		Sort_An_Array(arr);
	}

	public static void Sort_An_Array(int[] arr) {

		int temp = 0;
	
	    for(int  i = 0; i<arr.length; i++)
	    {
	    	for(int j = i+1; j<arr.length; j++)
	    	{
	    		if(arr[i] > arr[j])
	    		{
	    			temp = arr[i];
	    			arr[i] = arr[j];
	    			arr[j] = temp;
	    		}
	    	}
	    }
		
	    
	    System.out.println("Sorted Array Elements are : ");
	    for(int i = 0; i<arr.length; i++)
	    {
	    	System.out.print(arr[i] + " ");
	    }
	    
	}
	
}
