package arrays_Programs;

public class Find_index_Of_First_Occurenece_Element {

	

	    public static void main(String[] args) {
	    	
	    	
	        // Test array and target element
	        int[] array = {5, 1, 10, 20, 10, 25};
	        int target = 10;

	        // Find and print the index of the first occurrence of the target element
	        int index = findFirstOccurrence(array, target);
	        if (index != -1) {
	            System.out.println("First occurrence of " + target + " is at index: " + index);
	        } else {
	            System.out.println("Element " + target + " not found in the array.");
	        }
	    }

	    public static int findFirstOccurrence(int[] array, int target) {
	        // Iterate through the array to find the target element
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                return i; // Return the index of the first occurrence
	            }
	        }
	        return -1; // Return -1 if the target element is not found
	    }
	}



