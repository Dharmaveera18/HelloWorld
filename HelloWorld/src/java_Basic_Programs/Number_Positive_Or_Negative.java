package java_Basic_Programs;

import java.util.Scanner;

public class Number_Positive_Or_Negative {

	public static void main(String[] args) {


		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num>=0)
		{
			System.out.println("The number is Positive  " + num);
		}
		else
		{
			System.out.println("The number is Negative  " + num);
		}
		
		
		

	}

}
