package arrays_Programs;

import java.util.Arrays;

public class Binary_Search {

	public static void main(String[] args) {


		int arr[] = {1,2,3,4,5,6,7,8,9,10}; //Should be in sorted order
		
		
		boolean flag = false;
		
		int key = 100;
		int l = 0; //lower bound
		int h = arr.length-1;  //higher bound
		
		while(l<=h)
		{
			int m = (l+h)/2;
			if(key == arr[m])
			{
				flag = true;
				System.out.println("Element found :" + flag);
				
				break;
			}
			
			
			if(key < arr[m])
			{
				h = m-1;
			}
			
			if(key > arr[m])
			{
				l = m+1;
			}
		}
		
		if(flag == false)
		{
			System.out.println("Element not found : " + flag);
		}
		
		
		//Approach 2 ----> Using inbuilt function Arrays.binarySearch();
		
		System.out.println(Arrays.binarySearch(arr, 8)); //gives index of an elelemt else gives negative value.

	}

}
