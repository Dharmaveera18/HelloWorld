package com.Array_Programs;

public class Count_No_Occurence {

	
	public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
        
        //Array fr will store frequencies of element  
        int [] fr = new int [arr.length];  
        
        int visited = -1;  

        // Loop through each element in the array
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            
            // Check the rest of the array for occurrences of arr[i]
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    // Mark arr[j] as visited
                    fr[j] = visited;  
                }  
            }  
            
            // If arr[i] is not marked as visited, set its frequency
            if(fr[i] != visited)  
                fr[i] = count;  
        }  

        //Displays the frequency of each element present in array  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        
        // Print out the frequency of each element
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }
	
	
	
	
	
	
	
	
}
