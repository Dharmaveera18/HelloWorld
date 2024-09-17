package loop_Programs;

import java.util.Scanner;

public class Power_Of_Number {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base Number");
		int base = sc.nextInt();
		System.out.println("Enter the exponant Number");
		int exponent = sc.nextInt();
       
        int result = 1;  
        for (int i = 0; i < exponent; i++) {  
            result = result*base;  //result *= base
        }  
        System.out.println(base + " raised to the power of " + exponent + " is " + result);  
    
	  sc.close();
	}  

}
