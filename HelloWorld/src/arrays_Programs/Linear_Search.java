package arrays_Programs;

public class Linear_Search {

	public static void main(String[] args) {


		int arr[] = {10,30,20,40,50};
		boolean flag = false;
		int key = 100;
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == key)
			{
				flag = true;
				System.out.println("Element found : "+ i);
				break;
			}
		}
		if(flag ==  false)
		{
			System.out.println("Element not Found : ");
		}

	}

}
