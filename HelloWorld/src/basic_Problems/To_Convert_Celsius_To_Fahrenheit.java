package basic_Problems;

import java.util.Scanner;

public class To_Convert_Celsius_To_Fahrenheit {

	public static void main(String[] args) {
		// 
		
		
		// fahrenheit = (9/5 * celcius) + 32
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the temp in celsius");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println(fahrenheit);
		
		//So, 25 degrees Celsius is equal to 77 degrees Fahrenheit.
		
	}

}
